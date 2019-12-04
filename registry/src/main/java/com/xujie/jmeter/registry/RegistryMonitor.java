package com.xujie.jmeter.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Iterator;
import java.util.Map;

@Configuration
@EnableScheduling
public class RegistryMonitor {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Scheduled(fixedRate = 30000)
    public void monitorRegistry() {
        Long now = System.currentTimeMillis();
        logger.info("Checking slaves at " + System.currentTimeMillis());
        for (Iterator<Map.Entry<String, Long>> it = Registry.getRegistry().entrySet().iterator(); it.hasNext();) {
            Map.Entry<String, Long> m = it.next();
            long lastRegisterTime = m.getValue();
            if (now - lastRegisterTime > 30000) {
                logger.info("Removing slave " + m.getKey());
                it.remove();
            }
        }
    }
}
