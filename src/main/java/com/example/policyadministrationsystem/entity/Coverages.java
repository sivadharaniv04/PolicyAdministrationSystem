package com.example.policyadministrationsystem.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Coverages {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int coverageId;
    private String coverageName;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<PolicyDetails> details;

    public int getCoverageId() {
        return coverageId;
    }

    public void setCoverageId(int coverageId) {
        this.coverageId = coverageId;
    }

    public String getCoverageName() {
        return coverageName;
    }

    public void setCoverageName(String coverageName) {
        this.coverageName = coverageName;
    }

    public List<PolicyDetails> getDetails() {
        return details;
    }

    public void setDetails(List<PolicyDetails> details) {
        this.details = details;
    }
}
