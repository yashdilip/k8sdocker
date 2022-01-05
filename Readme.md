## Update local Maven settings.xml for the localRepository defined as
`<localRepository>${user.home}/.m2/repository</localRepository>`

## Maven build using `jib` profile from `pom.xml`. _it will build the image and push to local docker deamon if repository is not setup_
###mvn package -Pjib

## List docker image
### docker image ls

## Build and push directly to docker registory _need to do setup (user credentials and registry location, etc) for docker registry_
### mvn jib:build -Pjib