package com.example.policyadministrationsystem.dao;

import com.example.policyadministrationsystem.entity.Coverages;
import com.example.policyadministrationsystem.entity.PolicyDetails;
import com.example.policyadministrationsystem.entity.State;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PolicyDetailsDAOImplementation implements PolicyDetailsDAO {
    @Autowired
    public EntityManager manager;

    public PolicyDetailsDAOImplementation(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public List<PolicyDetails> findAll() {
        TypedQuery<PolicyDetails> query = manager.createQuery("from PolicyDetails", PolicyDetails.class);
        List<PolicyDetails> list = query.getResultList();
        return list;
    }

    @Override
    public PolicyDetails findById(int id) {
        return manager.find(PolicyDetails.class, id);
    }

    @Transactional
    @Override
    public PolicyDetails save(PolicyDetails details) {
        return manager.merge(details);
    }

    @Override
    public List<State> findAllState() {
        TypedQuery<State> query = manager.createQuery("from State", State.class);
        List<State> list = query.getResultList();
        return list;
    }

    @Override
    public State findByIdState(int id) {
        return manager.find(State.class, id);
    }

    @Override
    public List<Coverages> findAllCov() {
        TypedQuery<Coverages> query = manager.createQuery("from Coverages ", Coverages.class);
        List<Coverages> list = query.getResultList();
        return list;
    }

    @Override
    public Coverages findByIdCov(int id) {
        return manager.find(Coverages.class, id);
    }
}