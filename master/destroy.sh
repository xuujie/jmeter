kubectl delete deployment jmeter-master
kubectl delete configmap jmeter-test-plan

echo Wait for 5 seconds
sleep 5

kubectl get configmap jmeter-test-plan
kubectl get deployment,pods