package com.util;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

@Singleton
public class Employee {
    private int id;
    private Map<String, Object> config;

    public Map<String, Object> getFromConfig() {
        config = new HashMap<String, Object>();
        config.put("Key1", 1);
        config.put("key2", 2);
        return config;
    }

    public int getId() {
        return id;
    }
}
