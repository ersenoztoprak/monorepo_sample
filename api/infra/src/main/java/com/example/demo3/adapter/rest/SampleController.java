package com.example.demo3.adapter.rest;

import an.awesome.pipelinr.Pipeline;
import lombok.RequiredArgsConstructor;
import model.SampleCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final Pipeline pipeline;

    @GetMapping
    public void sample() {
        var sampleCommand = SampleCommand.builder().name("ersen").surname("oztoprak").build();
        var sampleResult = pipeline.send(sampleCommand);
        System.out.println(sampleResult.getFullName());

    }
}
