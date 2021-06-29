package com.alexvicuna.repository;

import com.alexvicuna.model.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository  extends JpaRepository<Issue, Long> {}
