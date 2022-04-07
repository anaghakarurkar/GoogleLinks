pipeline {
  agent any
  stages {
      stage('Build') {
          steps {
            echo "Building application"
          }
    }
      stage('Test') {
          steps {
            mvn test
            echo "Testing application"
          }
      }
      stage('Deploy') {
          steps {
            echo "Deploying application"
          }
      }
  }
}
