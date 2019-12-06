kubectl create configmap jmeter-test-plan --from-file=./system-info-test.jmx

kubectl apply -f k8s.yml

echo Wait for 5 seconds
sleep 5

kubectl get configmap jmeter-test-plan
kubectl get deployment,pods