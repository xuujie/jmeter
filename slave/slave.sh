#!/bin/bash

#get slave ip
SLAVE_IP="$(hostname --all-ip-addresses)"
echo SLAVE: $SLAVE_IP

#start slave
nohup jmeter-server &

#register slave to registry
echo REGISTRY: $REGISTRY_IP
while :
  do
    echo "Registering ${SLAVE_IP} to ${REGISTRY_IP}"
    curl -X POST http://${REGISTRY_IP}:9090/addSlave -H "Content-Type: application/json" -d "{\"ip\": \"${SLAVE_IP}\"}"
    sleep 10
done