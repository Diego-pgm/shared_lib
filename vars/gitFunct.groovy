def call() {
     git "https://github.com/Diego-pgm/some_code.git"
     sh "chmod +x ./testscript.sh"
     sh "./testscript.sh"
}
