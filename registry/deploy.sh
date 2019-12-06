kubectl apply -f k8s.yml

echo Wait for 5 seconds
sleep 5

kubectl get service,deployment,pods