pipeline {
    agent any

    tools {
        // This must match the name you gave Maven in "Global Tool Configuration"
        maven 'Default'
    }

    stages {
        stage('Checkout') {
            steps {
                // This pulls your code from the repo configured in the job
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // This is the equivalent of your "clean test" goal
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            // This captures your test results so Jenkins can show graphs
            junit '**/target/surefire-reports/*.xml'
        }
    }
}