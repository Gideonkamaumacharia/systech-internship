pipeline {
    agent any

    tools {
            jdk 'jdk21'
            maven 'maven3'
        }

    triggers {
        githubPush()
    }

    environment {
        BUILD_DIR       = "my-deploy-folder"
        REPO_URL        = "https://github.com/Gideonkamaumacharia/systech-internship.git"
        BRANCH          = "main"
        // --- Added for Docker Hub ---
        DOCKERHUB_USER  = "gideonkamau"
        IMAGE_NAME      = "systech-app"
        IMAGE_TAG       = "${env.BUILD_NUMBER}"
    }

    stages {
        stage('Checkout Code') {
            steps {
                sh 'java -version'
                git branch: "${BRANCH}",
                    credentialsId: 'github-creds',
                    url: "${REPO_URL}"
            }
        }

        stage('Build and Test with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Organize Artifacts') {
            steps {
                sh """
                    mkdir -p ${BUILD_DIR}
                    cp target/*.jar ${BUILD_DIR}/app.jar
                """
            }
        }

        // --- NEW STAGE: Build and Push to Docker Hub ---
        stage('Docker Build & Push') {
            steps {
                script {
                    sh "docker build -t ${DOCKERHUB_USER}/${IMAGE_NAME}:${IMAGE_TAG} ."

                    // 2. Login and Push using Jenkins Credentials
                    withCredentials([usernamePassword(credentialsId: 'dockerhub-creds',
                                     usernameVariable: 'USER',
                                     passwordVariable: 'PASS')]) {
                        sh "echo ${PASS} | docker login -u ${USER} --password-stdin"
                        sh "docker push ${DOCKERHUB_USER}/${IMAGE_NAME}:${IMAGE_TAG}"
                        sh "docker tag ${DOCKERHUB_USER}/${IMAGE_NAME}:${IMAGE_TAG} ${DOCKERHUB_USER}/${IMAGE_NAME}:latest"
                        sh "docker push ${DOCKERHUB_USER}/${IMAGE_NAME}:latest"
                    }
                }
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: "${BUILD_DIR}/*.jar", fingerprint: true
            echo "Build & Push Success! Image available at ${DOCKERHUB_USER}/${IMAGE_NAME}:${IMAGE_TAG}"
        }
        always {
            // Cleanup to save space on your Fedora machine
            sh "docker logout"
        }
    }
}