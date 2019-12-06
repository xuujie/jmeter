#!/bin/bash

#get slave ip
SLAVE_IP="$(hostname --all-ip-addresses)"
echo SLAVE: $SLAVE_IP

#start slave
nohup jmeter-server &

#register slave to registry
echo REGISTRY: $REGISTRY_URL
while :
  do
    echo "Registering ${SLAVE_IP} to ${REGISTRY_URL}"
    curl -X POST ${REGISTRY_URL} -H "Content-Type: application/json" -d "{\"ip\": \"${SLAVE_IP}\"}"
    sleep 10
done