def call() {
    if (isUnix()) {
        sh 'mvn test'
        } else {
            powershell 'mvn test'
        }
}
