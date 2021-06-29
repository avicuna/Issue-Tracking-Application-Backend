package com.alexvicuna.service;

import com.alexvicuna.repository.IssueRepository;
import com.alexvicuna.model.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IssueService {

    @Autowired
    IssueRepository issueRepository;

    public Optional<Issue> getIssue(Long id) {
        return issueRepository.findById(id);
    }

    public void createIssue(Issue issue) {
        issueRepository.save(issue);
    }

    public void deleteIssue(Long id) {
        issueRepository.deleteById(id);
    }
}
