package com.xujie.jmeter.registry;

public class Slave {
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Slave{" +
                "ip='" + ip + '\'' +
                '}';
    }
}
