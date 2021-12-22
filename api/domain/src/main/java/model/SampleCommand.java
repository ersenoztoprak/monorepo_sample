package model;

import an.awesome.pipelinr.Command;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SampleCommand implements Command<SampleResult> {
    private String name;
    private String surname;
}
