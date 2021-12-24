package com.example.demo3.port;

import org.springframework.stereotype.Component;

@Component
public class SampleAdapter implements SamplePort {

    @Override
    public String sample() {
        return "Sn. ";
    }
}
