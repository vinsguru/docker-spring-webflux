package com.vinsguru.candidateservice.client;

import com.vinsguru.candidateservice.dto.JobDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class JobClient {

    private final WebClient client;

    //job/search?skills=
    public JobClient(@Value("${job.service.url}") String baseUrl){
        this.client = WebClient.builder()
                                .baseUrl(baseUrl)
                                .build();
    }

    public Mono<List<JobDto>> getRecommendedJobs(Set<String> skills){
        return this.client.get()
                .uri(u -> u.path("search").queryParam("skills", skills).build())
                .retrieve()
                .bodyToFlux(JobDto.class)
                .collectList()
                .onErrorReturn(Collections.emptyList());
    }

}
