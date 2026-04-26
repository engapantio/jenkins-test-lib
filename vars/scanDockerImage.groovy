def call(String repo, String tag) {
    def vulnerabilities = sh(
        script: """
            trivy image \
                --exit-code 0 \
                --severity CRITICAL,HIGH,MEDIUM,LOW \
                --no-progress \
                --ignorefile .trivyignore \
                ${repo}:${imageTag}
        """,
        returnStdout: true
    ).trim()
    echo "Vulnerability Report:\n${vulnerabilities}"
}
