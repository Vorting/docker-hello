pipeline {
//    agent {
//        docker { image 'node:14-alpine' }
//    }
//    stages {
//        stage('Example') {
//            steps {
//                hello_there()
//            }
//        }
//    }
    agent any

    triggers {
        cron('H/15 * * * *')
    }
    stage('echo') {
        steps {
            echo 'hello from the trigger'
        }
    }
}
