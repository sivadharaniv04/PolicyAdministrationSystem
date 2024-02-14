package com.example.policyadministrationsystem.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class PolicyDetails {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int policyId;
    private String status;
    private String policyHolderName;
    private String addressLine1;
    private String addressLine2;
    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    public List<State> list=new ArrayList<>();
    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Coverages> coverages=new ArrayList<>();

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public List<State> getList() {
        return list;
    }

    public void setList(List<State> list) {
        this.list = list;
    }

    public List<Coverages> getCoverages() {
        return coverages;
    }

    public void setCoverages(List<Coverages> coverages) {
        this.coverages = coverages;
    }
}
