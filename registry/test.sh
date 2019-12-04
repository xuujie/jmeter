docker-compose down
./build.sh
docker-compose up

curl -X POST http://localhost:9090/addSlave -H "Content-Type: application/json" -d '{"ip": "192.168.1.1"}'
curl -X POST http://localhost:9090/addSlave -H "Content-Type: application/json" -d '{"ip": "192.168.1.2"}'
curl -X POST http://localhost:9090/addSlave -H "Content-Type: application/json" -d '{"ip": "192.168.1.3"}'
