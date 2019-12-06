#init k8s
kubectl apply -f k8s.yml

echo Wait for 10 seconds
sleep 10

#create database jmeter
curl -X POST http://localhost:8086/query --data-urlencode "q=CREATE DATABASE jmeter"

