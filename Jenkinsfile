pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                cmd_exec('mvn -B -DskipTests clean package') 
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        } 
    }
} 

def cmd_exec(command) {
    return bat(returnStdout: true, script: "${command}").trim()
}