package com.example.policyadministrationsystem.dao;

import com.example.policyadministrationsystem.entity.Coverages;
import com.example.policyadministrationsystem.entity.PolicyDetails;
import com.example.policyadministrationsystem.entity.Rate;
import com.example.policyadministrationsystem.entity.State;

import java.util.List;

public interface PolicyDetailsDAO {
    public List<PolicyDetails> findAll();
    public PolicyDetails findById(int id);
    public PolicyDetails save(PolicyDetails details);
    public List<State> findAllState();
    public State findByIdState(int id);
    public List<Coverages> findAllCov();
    public Coverages findByIdCov(int id);

}
