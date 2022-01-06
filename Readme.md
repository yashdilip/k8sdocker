## Update local Maven settings.xml for the localRepository defined as
`<localRepository>${user.home}/.m2/repository</localRepository>`

## Maven build using `jib` profile from `pom.xml`. _it will build the image and push to local docker deamon if repository is not setup_
###mvn package -Pjib

## List docker image
### docker image ls

## Build and push directly to docker registory _need to do setup (user credentials and registry location, etc) for docker registry_
### mvn jib:build -Pjib

## Kubernetes Resources
### Pods (pods), Deployments (deploy), and Services (svc)

## Create Deployment resource and pod (depoyment.yaml and pod.yaml should already be created)
### kubectl create -f deployment.yaml

## Create Service resources
### kubectl create -f service.yaml

## List all pods in ps output format
### kubectl get pods

## List all deployments
### kubectl get deployments

## List deployments in JSON output format, in the "v1" version of the "apps" API group
### kubectl get deployments.v1.apps -o json

## List all services
### kubectl get svc

## List all resources
### kubectl get svc,deployment,pods

## Remove deployment resource (removes pods too)
### kubectl delete -f deployment.yaml

## Remove service resource
### kubectl delete -f service.yaml

## Remove all services at once
### kubectl delete deployment/deployment svc/service

## We can have a single manifest file to create resources (deployment, service and pods). The manifest file can have Deployment and Service manifest separated by 3-dashes `---`. See `k8sdocker-single-manifest.yaml`