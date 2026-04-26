def call(String branchName) {
  if (branchName == 'dev') {
    return 'nodedev:v1.0'
  }
  if (branchName == 'main' || branchName == 'master') {
    return 'nodemain:v1.0'
  }
  error("Unsupported branch: ${branchName}")
}
