pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {

                    bat 'C:\Users\d385090\Downloads\apache-maven-3.5.4-bin\apache-maven-3.5.4\bin\mvn clean compile'

            }
        }

        stage ('Testing Stage') {

            steps {
                    bat 'mvn test'

            }
        }


        stage ('Deployment Stage') {
            steps {
                    bat 'mvn deploy'
                }

        }
    }
}