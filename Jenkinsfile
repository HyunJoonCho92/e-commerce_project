pipeline {
   agent any
   stages {
       stage('Build') {
           steps {
               sh './gradlew clean build' // 프로젝트 빌드
           }
       }
       stage('Test') {
           steps {
               sh './gradlew test' // 테스트 실행
           }
       }
       stage('Deploy') {
           steps {
               // 배포 스크립트 또는 AWS CLI 명령어
           }
       }
   }
}
