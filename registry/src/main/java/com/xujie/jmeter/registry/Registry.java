package com.xujie.jmeter.registry;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Registry {
    private static Map<String, Long> registeredSlaves = new HashMap<>();

    public static Map<String, Long> getRegistry() {
        return registeredSlaves;
    }

    public static void addSlave(String ip) {
        Registry.getRegistry().put(ip, System.currentTimeMillis());
    }

    public static void removeSlave(String ip) {
        Registry.getRegistry().remove(ip);
    }

    public static Set<String> getRegisteredSlaves() {
        return Registry.getRegistry().keySet();
    }
}
