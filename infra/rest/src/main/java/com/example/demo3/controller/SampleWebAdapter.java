package com.example.demo3.controller;

import an.awesome.pipelinr.Pipeline;
import com.example.demo3.model.SampleCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
@RequiredArgsConstructor
public class SampleWebAdapter {

    private final Pipeline pipeline;

    @GetMapping
    public void sample() {
        var sampleCommand = SampleCommand.builder().name("ersen").surname("oztoprak").build();
        var sampleResult = pipeline.send(sampleCommand);
        System.out.println(sampleResult.getFullName());

    }
}
