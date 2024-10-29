pipeline {
  agent { label 'jdk21' }

  tools {
    maven "maven_3_8_5"
  }

  parameters {
    string(name: 'CONTRASENIA', defaultValue: 'secreto', description: 'Ingresar la contrasenia')
  }

  stages {
    stage ('ejemplo') {
      steps {
        echo params.CONTRASENIA
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
