def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
        withMaven(maven:'Maven 3.9.3') {
            if (isUnix()) {
                sh 'mvn clean package sonar:sonar'
            } else {
                bat 'mvn clean package sonar:sonar'
            }
        }
                  
    }
}