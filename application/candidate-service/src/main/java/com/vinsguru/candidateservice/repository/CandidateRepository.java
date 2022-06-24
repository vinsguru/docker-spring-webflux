package com.vinsguru.candidateservice.repository;

import com.vinsguru.candidateservice.entity.Candidate;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends ReactiveCrudRepository<Candidate, String> {
}
