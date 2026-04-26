def call(String containerName, String repo, String imageTag, String hostPort) {
  sh """
    docker rm -f ${containerName} || true
    docker run -d --name ${containerName} -p ${hostPort}:3000 ${repo}:${imageTag}
  """
}
