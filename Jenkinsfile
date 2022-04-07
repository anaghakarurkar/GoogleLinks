pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
               echo 'Building application'
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    emailext body: 'Project using pipeline. Build successful!', subject: 'Pipeline success!', to: 'anaghakarurkar@gmail.com'
                }
            }
        }
    }
}
