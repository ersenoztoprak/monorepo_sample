package handler;

import an.awesome.pipelinr.Command;
import lombok.RequiredArgsConstructor;
import model.SampleCommand;
import model.SampleResult;
import org.springframework.stereotype.Component;
import port.SamplePort;

@Component
@RequiredArgsConstructor
public class SampleUseCaseHandler implements Command.Handler<SampleCommand, SampleResult> {

    private final SamplePort samplePort;
    @Override
    public SampleResult handle(SampleCommand command) {
        return SampleResult.builder().fullName(samplePort.sample() + command.getName() + " " + command.getSurname()).build();
    }
}
