def call(String repo, String imageTag) {
  docker.image('aquasec/trivy:latest').inside('-v /var/run/docker.sock:/var/run/docker.sock') {
    sh "trivy image --severity HIGH,CRITICAL --exit-code 1 ${repo}:${imageTag}"
  }
}
