def call() {
     git branch: 'main', url: 'https://github.com/Diego-pgm/some_code.git'
     sh "chmod +x ./testscript.sh"
     sh "./testscript.sh"
}
