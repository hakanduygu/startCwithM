pipeline {
  agent {
    node {
      label 'iQuality'
    }

  }
  stages {
    stage('Control XML Files') {
      steps {
        fileExists 'testng.xml'
        fileExists 'pom.xml'
        writeFile(file: 'testSteps.java', text: '/* im writing something in this workspace */')
        cleanWs(cleanWhenAborted: true, skipWhenFailed: true)
      }
    }

  }
}