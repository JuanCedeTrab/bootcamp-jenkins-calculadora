pipeline {
  agent any

  tools {
    maven "maven_3_8_5"
  }

  parameters {
    string(name: 'CONTRASENIA', defaultValue: 'secreto', description: 'Ingresar la contrasenia')
  }

  stages {
    stage('Build') {
      steps {
        bat 'mvn -B -q package'
      }
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }
        failure {
          echo "Este es en un caso de fallo"
          echo env.JOB_NAME
        }
        success {
          echo "Termino bien la tarea"
          echo CONTRASENIA
      }
    }
  }
}
}
