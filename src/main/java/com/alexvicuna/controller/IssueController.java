package com.alexvicuna.controller;

import com.alexvicuna.model.Issue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/issue")
public class IssueController {

    @GetMapping("/{id}")
    public ResponseEntity index(@PathVariable Long id) {
        return ResponseEntity.ok("Get request called");
    }

    @PostMapping
    public ResponseEntity createIssue(@RequestBody Issue issue) {
        return ResponseEntity.ok("Post request called");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteIssue(@PathVariable Long id) {
        return ResponseEntity.ok("Delete request called");
    }

}
