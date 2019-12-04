#!/bin/bash
echo REGISTRY: $REGISTRY_IP

SLAVES="$(curl http://${REGISTRY_IP}:9090/s)"

#start master
jmeter -n -t /tmp/test/system-info-test.jmx -R $SLAVES