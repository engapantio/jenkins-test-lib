def call(String repo, String imageTag) {
  sh "trivy image --severity HIGH,CRITICAL --exit-code 1 ${repo}:${imageTag}"
}
