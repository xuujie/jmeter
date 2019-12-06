kubectl delete service jmeter-registry-service
kubectl delete deployment jmeter-registry

echo Wait for 5 seconds
sleep 5

kubectl get service,deployment,pods