pipeline {
  agent { label 'jdk21' }

  tools {
    maven "maven_3_8_5"
  }

  parameters {
    string(name: 'ENTRADA', defaultValue: 'Hola', description: 'Un parametro requerido')
  }

  stages {
    stage ('ejemplo') {
      steps {
        echo params.ENTRADA
      }
    }
    stage('Build') {
      steps {
        bat 'mvn -B -q package'
      }
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }
      }
    }
  }

}
