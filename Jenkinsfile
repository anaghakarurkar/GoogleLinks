pipeline 
{
    agent any
    tools {
        maven 'Maven'
        jdk 'MyJDK'        
    }
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
                echo 'Deployment stage complete'
                //withMaven(maven : 'Maven')
               // {
                 //   sh 'mvn deploy'
                //}
            }
        }
          
    }
}
