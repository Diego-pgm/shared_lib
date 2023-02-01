def call(Map config = []) {
   sh "echo Hello ${config.name} today is ${config.dayOfWeek}"
   git url "https://github.com/Diego-pgm/some_code.git"
   sh 'chmod +x ./testscript.sh'
   sh './testscript.sh'
}
