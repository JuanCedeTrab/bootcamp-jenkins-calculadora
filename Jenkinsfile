pipeline {
  agent any

  tools {
    maven "maven_3_8_5"
  }

  stages {
    stage('Build') {
      steps {
        bat 'mvn -B -q package'
      }
      post {
        always {
          junit 'target/surfire-reports/*.xml'
        }
      }
    }
  }

}
