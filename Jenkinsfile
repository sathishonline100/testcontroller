pipeline {
    agent any

    stages {
	
		stage('Source') { // Get code
		// get code from our Git repository
		git 'https://github.com/sathishonline100/testcontroller.git'
		}
	
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn test'
                }
            }
        }


        stage ('Deployment Stage') {
            steps {
                withMaven(maven : 'maven') {
                    sh 'mvn deploy'
                }
            }
        }
    }
}
