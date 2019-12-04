package com.xujie.jmeter.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class RegistryController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/slaves")
    public Set<String> registeredSlaves() {
        return Registry.getRegisteredSlaves();
    }

    @GetMapping("/s")
    public String registeredSlavesInString() {
        StringBuilder s = new StringBuilder();
        for (String sl : Registry.getRegisteredSlaves()) {
            s.append(",").append(sl);
        }
        return s.toString().replaceFirst(",", "");
    }

    @PostMapping("/addSlave")
    public void addSlave(@RequestBody Slave slave) {
        logger.info(slave.getIp());
        Registry.addSlave(slave.getIp().trim());
    }

    @PostMapping("/removeSlave")
    public void removeSlave(@RequestBody Slave slave) {
        logger.info(slave.getIp());
        Registry.removeSlave(slave.getIp().trim());
    }
}
