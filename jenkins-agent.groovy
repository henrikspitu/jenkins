pipeline {

 

  agent { label 'maven3.6' }
 

stages {

    stage('Say Hello') {

        steps {

            println "we say hello uising cron trigger"

        }

    }

}

 

}