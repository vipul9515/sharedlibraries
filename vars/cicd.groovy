def newGit(repo)
{
   git "https://github.com/intelliqittrainings/${repo}.git"
}

def newMaven()
{
   sh 'mvn package'
}



def newDeploy()
{
deploy adapters: [tomcat9(credentialsId: '2e024ab6-cb3e-4e88-9651-a78810d0722d', path: '', url: 'http://172.31.32.228:8080')], contextPath: 'test1', war: '**/*.war'
}

def newTest()
{
git 'https://github.com/intelliqittrainings/FunctionalTesting.git'
sh 'java -jar /var/lib/jenkins/workspace/DeclarativePipeline1/testing.jar'                    
}


def newdel()
{
deploy adapters: [tomcat9(credentialsId: '2e024ab6-cb3e-4e88-9651-a78810d0722d', path: '', url: 'http://172.31.36.57:8080')], contextPath: 'prod1', war: '**/*.war'                   
}


