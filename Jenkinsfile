pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                cmd_exec('mvn -B -DskipTests clean package') 
            }
        }
    }
} 

def cmd_exec(command) {
    return bat(returnStdout: true, script: "${command}").trim()
}