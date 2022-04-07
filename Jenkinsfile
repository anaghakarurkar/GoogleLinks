pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn test"
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
