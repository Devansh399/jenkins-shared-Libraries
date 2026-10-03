def call(String Project, String ImageTag, String dockerHubUser){

   echo "Pushing image to docker hub"
                withCredentials([usernamePassword('credentialsId':"dockercre", passwordVariable:"dockerHubPass", usernameVarialbe:"dockerHubUser")])
                {
                sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                sh "docker image tag notes-app:latest devansh766/notes-app:latest"
                sh "docker push devansh766/notes-app:latest"
                }

  sh "docker push ${dockerhubUser}/${Project}:${ImageTag}"
  
}
