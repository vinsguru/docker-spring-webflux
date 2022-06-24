package com.vinsguru.candidateservice.controller;

import com.vinsguru.candidateservice.dto.CandidateDetailsDto;
import com.vinsguru.candidateservice.dto.CandidateDto;
import com.vinsguru.candidateservice.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("candidate")
public class CandidateController {

    @Autowired
    private CandidateService service;

    @GetMapping("all")
    public Flux<CandidateDto> allCandidates(){
        return this.service.all();
    }

    @GetMapping("{id}")
    public Mono<CandidateDetailsDto> getById(@PathVariable String id){
        return this.service.getById(id);
    }

    @PostMapping
    public Mono<CandidateDto> save(@RequestBody Mono<CandidateDto> mono){
        return this.service.save(mono);
    }

}
