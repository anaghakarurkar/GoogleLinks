pipeline 
{
    agent any
    stages 
    {
        stage('Compile Stage') 
        {
            steps
            {
                withMaven(maven : 'Maven')
                {
                    sh 'mvn clean compile'
                }
            }
            
        }
        stage('Testing stage')
        {
            steps
            {
                withMaven(maven : 'Maven')
                {
                    sh 'mvn test'
                }
            }
        }
        stage('Deployment stage')
        {
            steps
            {
                withMaven(maven : 'Maven')
                {
                    sh 'mvn deploy'
                }
            }
        }
          
    }
}
