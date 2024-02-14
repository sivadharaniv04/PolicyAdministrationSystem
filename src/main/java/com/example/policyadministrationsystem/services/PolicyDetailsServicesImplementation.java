package com.example.policyadministrationsystem.services;

import com.example.policyadministrationsystem.dao.PolicyDetailsDAO;
import com.example.policyadministrationsystem.entity.Coverages;
import com.example.policyadministrationsystem.entity.PolicyDetails;
import com.example.policyadministrationsystem.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PolicyDetailsServicesImplementation implements PolicyDetailsServices{
    @Autowired
    PolicyDetailsDAO dao;
    @Override
    public List<PolicyDetails> viewPolicyDetails() {
        return dao.findAll();
    }

    @Override
    public PolicyDetails viewPolicyById(int id) {
        return dao.findById(id);
    }

    @Override
    public PolicyDetails savePolicyDetails(PolicyDetails details) {
        return dao.save(details);
    }

    @Override
    public List<State> viewStateDetails() {
        return dao.findAllState();
    }

    @Override
    public State viewStateById(int id) {
        return dao.findByIdState(id);
    }

    @Override
    public List<Coverages> viewCovDetails() {
        return dao.findAllCov();
    }

    @Override
    public Coverages viewCovById(int id) {
        return dao.findByIdCov(id);
    }
}
