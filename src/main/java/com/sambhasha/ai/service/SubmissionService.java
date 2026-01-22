package com.sambhasha.ai.service;

import com.sambhasha.ai.entity.Submission;
import com.sambhasha.ai.repository.SubmissionRepository;
import org.springframework.stereotype.Service;

@Service
public class SubmissionService {

    private final SubmissionRepository repository;

    public SubmissionService(SubmissionRepository repository) {
        this.repository = repository;
    }

    public Submission saveSubmission(String text, String context) {
        Submission submission = new Submission();
        submission.setText(text);
        submission.setContext(context);
        return repository.save(submission);
    }
}
