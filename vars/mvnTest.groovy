def call() {
    if (isUnix()) {
        sh 'mvn test'
    } else {
        bat 'mvn test'
    }
}
