pipeline{
    agent any

    stages{
        stage('Compile Stage'){
            withMaven(maven:'maven_3.6.1'){
                sh 'mvn compile'
            }
        }
    }
}