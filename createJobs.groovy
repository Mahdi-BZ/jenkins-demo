pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Mahdi-BZ/spring-boot-CI-CD.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
