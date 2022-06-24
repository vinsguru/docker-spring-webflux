package com.vinsguru.candidateservice.dto;

import lombok.Data;

import java.util.Set;

@Data
public class JobDto {

    private String id;
    private String description;
    private String company;
    private Set<String> skills;
    private Integer salary;
    private Boolean isRemote;

}
