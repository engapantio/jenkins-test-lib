def call(String branchName) {
  if (branchName == 'dev') {
    return 'dev-container'
  }
  if (branchName == 'main' || branchName == 'master') {
    return 'main-container'
  }
  error("Unsupported branch: ${branchName}")
}
