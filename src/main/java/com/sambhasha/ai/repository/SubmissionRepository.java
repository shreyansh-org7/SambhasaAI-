package com.sambhasha.ai.repository;

import com.sambhasha.ai.entity.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}
