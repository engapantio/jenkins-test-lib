def call(String repo, String imageTag, String credsId) {
  dockerLogin(credsId)
  sh "docker push ${repo}:${imageTag}"
}