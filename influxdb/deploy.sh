#init k8s
kubectl apply -f k8s.yml

sleep 20

#create database jmeter
curl -X POST http://localhost:8086/query --data-urlencode "q=CREATE DATABASE jmeter"

