def call(String ImageName, String ImageTag, String DockerHubUser){
    // withCredentials([usernamePassword(
    //         credentialsId: "docker",
    //         usernameVariable: "USER",
    //         passwordVariable: "PASS"
    // )]) 
    sh """   
     docker login -u 'vsnondoh' -p 'Omerta@1988'
     docker image push ${DockerHubUser}/${ImageName}:${ImageTag}
     docker image push ${DockerHubUser}/${ImageName}:latest
    """  
}


// def call(String aws_account_id, String region, String ecr_repoName){
    
//     sh """
//      aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
//      docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//     """
// }