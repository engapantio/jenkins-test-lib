def call(String repo, String imageTag) {
  sh "docker build -t ${repo}:${imageTag} ."
}