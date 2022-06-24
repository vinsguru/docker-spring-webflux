package com.vinsguru.candidateservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(staticName = "create")
public class Service {

    private String name;
    private int port;
    private String hostPort;
    private String uri;
    private String hostPortEnvVariable;

}
