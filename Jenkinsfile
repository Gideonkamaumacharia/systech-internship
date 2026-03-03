pipeline {
    agent any

    triggers {
        githubPush() // Listens for GitHub Webhooks
    }

    environment {
        // Update these to match YOUR project
        BUILD_DIR   = "my-deploy-folder"
        REPO_URL    = "https://github.com/Gideonkamaumacharia/systech-internship.git"
        BRANCH      = "main"
        // If your pom.xml is in the root, you might not even need PROJECT_DIR
    }

    stages {
        stage('Checkout Code') {
            steps {
                // Uses the variables defined above
                git branch: "${BRANCH}",
                    credentialsId: 'github-creds', // Match your Credential ID
                    url: "${REPO_URL}"
            }
        }

        stage('Build and Test with Maven') {
            steps {
                // Maven equivalent of ./gradlew clean build
                sh 'mvn clean package'
            }
        }

        stage('Organize Artifacts') {
            steps {
                sh """
                    mkdir -p ${BUILD_DIR}
                    # Maven puts its jars in the 'target' folder
                    cp target/*.jar ${BUILD_DIR}/
                """
            }
        }
    }

    post {
        success {
            // This 'archives' the file so you can download it from the Jenkins UI
            archiveArtifacts artifacts: "${BUILD_DIR}/*.jar", fingerprint: true
            echo "Build Success! Check the 'Artifacts' section in Jenkins."
        }
    }
}