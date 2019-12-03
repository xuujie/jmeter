package com.xujie.jmeter.registry;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class RegistryController {
    Logger logger = LoggerFactory.getLogger(getClass());

    private static Map<String, Slave> registeredSlaves = new HashMap<>();

    @GetMapping("/slaves")
    public Set<String> registeredSlaves() {
        return registeredSlaves.keySet();
    }

    @PostMapping("/addSlave")
    public void addSlave(@RequestBody Slave slave) {
        logger.info(slave.getIp());
        registeredSlaves.put(slave.getIp(), slave);
    }

    @PostMapping("/removeSlave")
    public void removeSlave(@RequestBody Slave slave) {
        logger.info(slave.getIp());
        registeredSlaves.remove(slave.getIp());
    }
}
