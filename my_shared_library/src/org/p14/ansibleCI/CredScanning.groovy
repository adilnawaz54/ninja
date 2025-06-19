package org.p14.ansibleCI

def call(String playbookName) {
    stage("cred Scanning") {
        script {
            sh "gitleaks detect --source=${playbookName} --verbose --report-path=gitleaks-report.json"
        }
    }
}
