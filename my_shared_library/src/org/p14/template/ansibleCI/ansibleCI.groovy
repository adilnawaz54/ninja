package org.p14.ansibleCI

import org.p14.ansibleCI.*
import org.p14.common.*

def call(String url, String branch, String creds, String playbookName) {

    // Create instances of required classes
     def gitCheckOut = new gitCheckOut()
     def wsClean=new wsClean()
     def SyntaxCheck=new SyntaxCheck()
     def CredScanning = new CredScanning()
     def ansibleLint = new ansibleLint()

    // Call methods with correct arguments
    wsClean.call()
    gitCheckOut.call(url, branch, creds)
    SyntaxCheck.call(playbookName)
    CredScanning.call(playbookName)
    ansibleLint.call(playbookName)
}
