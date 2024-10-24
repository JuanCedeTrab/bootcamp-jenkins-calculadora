pipeline {
  agent any

  tools {
    maven "maven_3_8_5"
  }

  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -q package'
      }
    }
  }

}
