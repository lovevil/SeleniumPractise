pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from Git repository
                git branch: 'main', url: 'https://github.com/lovevil/SeleniumPractise.git'
            }
        }
        stage('Build') {
            steps {
                // Run Maven build for pom.xml
                sh 'mvn clean install'
            }
        }
    }
}
