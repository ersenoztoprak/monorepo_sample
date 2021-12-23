package com.example.demo3.handler;

import an.awesome.pipelinr.Command;
import lombok.RequiredArgsConstructor;
import com.example.demo3.model.SampleCommand;
import com.example.demo3.model.SampleResult;
import org.springframework.stereotype.Component;
import com.example.demo3.port.SamplePort;

@Component
@RequiredArgsConstructor
public class SampleUseCaseHandler implements Command.Handler<SampleCommand, SampleResult> {

    private final SamplePort samplePort;

    @Override
    public SampleResult handle(SampleCommand command) {
        return SampleResult.builder().fullName(samplePort.sample() + command.getName() + " " + command.getSurname()).build();
    }
}
