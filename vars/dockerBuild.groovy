def call(String ImageName, String ImageTag, String DockerHubUser){    
    sh """
     sudo docker image build -t ${DockerHubUser}/${ImageName} . 
     sudo docker image tag ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:${ImageTag}
     sudo docker image tag ${DockerHubUser}/${ImageName} ${DockerHubUser}/${ImageName}:latest
    """
}

// def call(String aws_account_id, String region, String ecr_repoName){
    
//     sh """
//      docker build -t ${ecr_repoName} .
//      docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//     """
// }