pipeline {
	agent {
	docker { image 'node:14-alpine'}
	}

	stages {
		stage ('Example') {
		steps {
		 helloWorld()
		}
	}
	}
}