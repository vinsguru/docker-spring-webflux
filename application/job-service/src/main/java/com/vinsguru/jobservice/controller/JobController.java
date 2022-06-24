package com.vinsguru.jobservice.controller;

import com.vinsguru.jobservice.dto.JobDto;
import com.vinsguru.jobservice.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;

@RestController
@RequestMapping("job")
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("all")
    public Flux<JobDto> all(){
        return this.service.allJobs();
    }

    @GetMapping("search")
    public Flux<JobDto> search(@RequestParam Set<String> skills){
        return this.service.jobsBySkillsIn(skills);
    }

    @PostMapping
    public Mono<JobDto> save(@RequestBody Mono<JobDto> mono){
        return this.service.save(mono);
    }

}
