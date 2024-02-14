package com.example.policyadministrationsystem.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class State {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int stateId;
    private String stateName;
    @ManyToMany(cascade = CascadeType.ALL)
    public List<PolicyDetails> details;

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<PolicyDetails> getDetails() {
        return details;
    }

    public void setDetails(List<PolicyDetails> details) {
        this.details = details;
    }
}
