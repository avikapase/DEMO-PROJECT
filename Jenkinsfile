pipeline {
    agent any

parameters {
        choice(name: 'name', choices: ['Avinash', 'CRIF'], description: 'This will be used as parameter')
    }

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean'
            }
        }
        stage('Test') {
        when {
                expression {
                    params.name == 'Avinash'
                }
            }
            steps {
               bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                bat "echo DeployCheck"
            }
        }
    }
}