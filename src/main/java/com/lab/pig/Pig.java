package com.lab.pig;

public class Pig {
    private String market_name;
    private String addr;
    private String context;
    private String type;

    public String getMarket_name() {
        return market_name;
    }

    public void setMarket_name(String market_name) {
        this.market_name = market_name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "pig{" + "market_name=" + market_name + ", addr=" + addr + ", context=" + context + ", type=" + type + '}';
    }
    
}
