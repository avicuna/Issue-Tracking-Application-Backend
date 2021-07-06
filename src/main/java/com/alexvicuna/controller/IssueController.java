package com.alexvicuna.controller;

import com.alexvicuna.model.Issue;
import com.alexvicuna.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/issue")
public class IssueController {

    @Autowired
    IssueService issueService;

    @GetMapping("/{id}")
    public ResponseEntity index(@PathVariable Long id) {
        Optional<Issue> issue = issueService.getIssue(id);
        if(issue.isEmpty()) {
           return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(issue);
    }

    @GetMapping
    public ResponseEntity getAllIssues() {
        List<Issue> issues = issueService.getAllIssues();
        return ResponseEntity.ok(issues);
    }

    @PostMapping
    public ResponseEntity createIssue(@RequestBody Issue issue) {
        issueService.createIssue(issue);
        return ResponseEntity.ok("Issue created");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteIssue(@PathVariable Long id) {
        issueService.deleteIssue(id);
        return ResponseEntity.ok("Issue deleted");
    }

}
