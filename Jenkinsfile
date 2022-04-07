pipeline 
{
    agent any
    stages 
    {
        stage('Build') 
        {
            steps
            {
               echo 'Building application'
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
