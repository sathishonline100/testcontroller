pipeline{
    agent any


    stages{
        stage('Compile Stage'){
         steps{
                          withMaven(maven:'maven_3.5.4'){
                                    sh 'mvn clean compile'
                          }
                     }

        }
    }
}