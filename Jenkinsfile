pipeline {
  agent any
  stages {
    stage('Sources') {
      steps {
        git(url: 'https://github.com/bluesskim/spring-api-app', branch: 'main', credentialsId: 'bluesskim')
      }
    }

    stage('Build') {
      steps {
        tool 'gradle7'
      }
    }

    stage('Deploy') {
      steps {
        sh 'echo "Deploy Success"'
      }
    }

  }
}