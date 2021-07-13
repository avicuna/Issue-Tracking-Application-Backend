package com.alexvicuna.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "issues")
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "date_submitted")
    private Date dateSubmitted;

    @Column(name = "status")
    private int status;

    public Issue() {
    }

    public Issue(long id, String title, String description, Date dateSubmitted, int status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateSubmitted = dateSubmitted;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateSubmitted() {
        return dateSubmitted;
    }

    public void setDateSubmitted(Date dateSubmitted) {
        this.dateSubmitted = dateSubmitted;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Issue issue = (Issue) o;
        return id == issue.id && status == issue.status && Objects.equals(title, issue.title) && Objects.equals(description, issue.description) && Objects.equals(dateSubmitted, issue.dateSubmitted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, dateSubmitted, status);
    }
}
