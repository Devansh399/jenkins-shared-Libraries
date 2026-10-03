def call(String Project Name, String ImageTag, String DockerHubUser){
sh " docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
