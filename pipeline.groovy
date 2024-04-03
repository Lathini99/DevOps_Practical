pipeline {
  agent any

  stages {
    stage('Dockerize the application'){
      steps{
       script{
          sh 'docker build -t sample .'
        }
      }
    }
     stage('Verify Docker images'){
      steps{
         script{
          sh 'docker images'
        }
      }
     }
     stage('Run the Docker container'){
      steps{
         script{
          sh 'docker run --name flask_app  -p 8000:5000 sample'
        }
      }
     }
  }
}
