package com.vinsguru.candidateservice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document
public class Candidate {

    @Id
    private String id;
    private String name;
    private Set<String> skills;

}
