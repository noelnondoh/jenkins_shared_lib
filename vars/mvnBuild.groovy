def call(){
    if (isUnix()) {
        sh 'mvn clean install'
    } else {
        bat 'mvn clean install'
    }  
    
}