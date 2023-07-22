def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
        if (isUnix()) {
            sh 'mvn clean package sonar:sonar'
        } else {
            bat 'mvn clean package sonar:sonar'
        }          
    }
}