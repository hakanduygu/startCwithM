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
      }
    }

  }
}