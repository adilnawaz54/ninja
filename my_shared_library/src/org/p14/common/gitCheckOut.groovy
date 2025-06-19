package org.p14.common

def call(String url, String branch, String creds) {
    stage("Clone Private Repo") {
        script{
                git branch: branch, url: url, credentialsId: creds
        }
    }
}
