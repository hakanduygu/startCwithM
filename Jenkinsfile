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
        writeFile(file: 'steps', text: '/* im writing something in this workspace */')
      }
    }

  }
}