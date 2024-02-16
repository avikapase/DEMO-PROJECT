pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
               sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Add deployment steps here if applicable
            }
        }
    }
}