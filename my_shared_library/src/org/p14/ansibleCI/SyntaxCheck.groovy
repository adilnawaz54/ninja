package org.p14.ansibleCI

def call(String playbookName) {
    stage("Syntax Check") {
        script {
            sh "ansible-playbook --syntax-check ${playbookName} || true"
        }
    }
}
