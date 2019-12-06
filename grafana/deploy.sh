kubectl apply -f k8s.yml

sleep 20

#create api key
#curl -X POST http://admin:JmeterGrafana123@localhost:3000/api/auth/keys -H "Content-Type: application/json" -d "{\"name\": \"clikey\", \"role\": \"Admin\"}"

#create datasource
curl -X POST http://admin:JmeterGrafana123@localhost:3000/api/datasources -H "Content-Type: application/json" -d @datasource.json

