#!/bin/bash
echo REGISTRY: $REGISTRY_URL

SLAVES=$(curl ${REGISTRY_URL})
echo SLAVES: ${SLAVES}
ls -la /tmp/test/system-info-test.jmx

#start master
echo starting jmeter master

jmeter -n -t /tmp/test/system-info-test.jmx -R $SLAVES