package handler;

import an.awesome.pipelinr.Command;
import lombok.RequiredArgsConstructor;
import model.SampleCommand;
import model.SampleResult;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SampleUseCaseHandler implements Command.Handler<SampleCommand, SampleResult> {

    @Override
    public SampleResult handle(SampleCommand command) {
        return SampleResult.builder().fullName(command.getName() + " " + command.getSurname()).build();
    }
}
