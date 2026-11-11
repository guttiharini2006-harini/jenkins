pipeline {
    agent any
    stages{
        stage('Checkout'){
            steps{
                checkout scm
            }
        }
        stage('compile'){
            steps{
                bat 'javac Factorial.java TestFactorial.java'
            }
        }
        stage('test'){
            steps{
                bat 'java TestFactorial.java'
            }
        }
        
    }
    post{
        success{
            echo "successful!"
        }
        failure{
            echo "failure"
        }
    }
}
