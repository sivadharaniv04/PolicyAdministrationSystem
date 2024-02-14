package com.example.policyadministrationsystem.services;

import com.example.policyadministrationsystem.entity.Coverages;
import com.example.policyadministrationsystem.entity.PolicyDetails;
import com.example.policyadministrationsystem.entity.State;

import java.util.List;

public interface PolicyDetailsServices {
    public List<PolicyDetails> viewPolicyDetails();
    public PolicyDetails viewPolicyById(int id);
    public PolicyDetails savePolicyDetails(PolicyDetails details);
    public List<State> viewStateDetails();
    public State viewStateById(int id);
    public List<Coverages> viewCovDetails();
    public Coverages viewCovById(int id);
}
