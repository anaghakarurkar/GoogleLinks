pipeline 
{
    agent any
    stages 
    {
        stage('Build') 
        {
            steps
            {
               sh 'mvn -B -DskipTests clean package'
               echo 'Building application'
            }
        }
        stage('Test')
        {
            steps
            {
                 sh 'mvn test'
            }
        }
          
    }
    post
       {
           success
           {
                    emailext body: 'Project using pipeline. Build successful!', subject: 'Pipeline success!', to: 'anaghakarurkar@gmail.com'
                
            }
       }
}
