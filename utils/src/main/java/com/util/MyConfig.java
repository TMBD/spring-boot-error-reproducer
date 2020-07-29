package com.util;

import org.springframework.validation.annotation.Validated;
import lombok.Data;

@Data
@Validated
public class MyConfig {
    private String name;
    private Employee e;

    public Employee getE() {
        return e;
    }

    public String getName() {
        return name;
    }
}
