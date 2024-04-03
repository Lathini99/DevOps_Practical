pipeline {
  agent any

  stages {
    stage('Stage-1'){
      steps{
        echo 'Stage1-Completed'
      }
    }
     stage('Stage-2'){
      steps{
        echo 'Stage2-Completed'
      }
     }
     stage('Stage-3'){
      steps{
        echo 'Stage3-Completed'
      }
     }
  }
}
