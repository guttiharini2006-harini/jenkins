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
                bat 'javac Factorial.java TestFactorial.jav'
            }
        }
        stage('test'){
            steps{
                bat 'java TestFactorial.java'
            }
        }
        stage('Package JAR'){
            steps{
                bat '"C:\\Program Files\\Java\\jdk-17\\bin\\jar.exe" cfm factorial.jar -r manifest.txt */class'
            }
        }
        stage('Archive JAR'){
            steps{
                archiveArtifacts: artifact factorial.jar
            }
        }
    }
}
