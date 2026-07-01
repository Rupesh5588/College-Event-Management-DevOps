pipeline {
    agent any

    environment {
        IMAGE_NAME = "college-event:latest"
    }

    stages {


        stage('Build') {
            steps {
                bat 'mvnw.cmd clean package'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %IMAGE_NAME% .'
            }
        }

    }

    post {

        success {
            echo 'Build completed successfully!'
        }

        failure {
            echo 'Build failed!'
        }

    }

}