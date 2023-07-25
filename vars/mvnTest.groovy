// def call() {
//     if (isUnix()) {
//         sh 'mvn test'
//     } else {
//         bat 'mvn test'
//     }
// }

def call() {
    sh 'mvn test'
}
