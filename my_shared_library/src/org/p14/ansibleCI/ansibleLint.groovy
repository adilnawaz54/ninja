package org.p14.ansibleCI

def call(String playbookName) {
    stage("Lint Check") {
        script {
            sh """
                python3 -m venv venv
                . venv/bin/activate
                pip install --upgrade pip
                pip install ansible-lint
                venv/bin/ansible-lint ${playbookName} || true
            """
        }
    }
}
