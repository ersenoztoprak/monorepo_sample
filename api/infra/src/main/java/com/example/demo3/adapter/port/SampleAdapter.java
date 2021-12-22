package com.example.demo3.adapter.port;

import org.springframework.stereotype.Component;
import port.SamplePort;

@Component
public class SampleAdapter implements SamplePort {
    @Override
    public String sample() {
        return "Sn. ";
    }
}