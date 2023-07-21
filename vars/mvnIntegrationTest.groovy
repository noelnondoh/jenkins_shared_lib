def call(){
    if (isUnix()) {
        sh 'mvn verify -DskipUnitTests'
    } else {
        bat 'mvn verify -DskipUnitTests'
    }
    
}