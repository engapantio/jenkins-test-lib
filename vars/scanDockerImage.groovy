def call(String repo, String imageTag) {
  sh "trivy image --severity HIGH,CRITICAL --ignore-unfixed --exit-code 1 ${repo}:${imageTag}"
}
