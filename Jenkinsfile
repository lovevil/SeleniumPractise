pipeline {
    agent any
   

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', // Replace with your desired branch
                    url: 'https://github.com/lovevil/SeleniumPractise.git'
            }
        }
        stage('Build with Maven') {
            steps {
             sh 'mvn clean install' // Replace with your desired Maven goals
            }
        }
    }
}
