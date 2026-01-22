package com.sambhasha.ai.controller;

import com.sambhasha.ai.dto.TextSubmissionRequest;
import com.sambhasha.ai.entity.Submission;
import com.sambhasha.ai.service.SubmissionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/analyze")
public class AnalysisController {

    private final SubmissionService submissionService;

    public AnalysisController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @PostMapping("/text")
    public Submission analyzeText(@RequestBody TextSubmissionRequest request) {
        return submissionService.saveSubmission(
                request.getText(),
                request.getContext()
        );
    }
}
