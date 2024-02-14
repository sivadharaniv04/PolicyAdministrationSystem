package com.example.policyadministrationsystem.controller;

import com.example.policyadministrationsystem.entity.Coverages;
import com.example.policyadministrationsystem.entity.PolicyDetails;
import com.example.policyadministrationsystem.entity.State;
import com.example.policyadministrationsystem.services.PolicyDetailsServicesImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("policy/")
public class PolicyDetailsController {
    @Autowired
    PolicyDetailsServicesImplementation implementation;
    @GetMapping("insert")
    public String index(Model model){
        model.addAttribute("policy",new PolicyDetails());
        model.addAttribute("state",implementation.viewStateDetails());
        model.addAttribute("coverage",implementation.viewCovDetails());
        return "insert";
    }
    @PostMapping("save")
    public String save(@ModelAttribute("policy") PolicyDetails details,@RequestParam("coverage") String coverage[],@RequestParam("state") String selectedstate[]) {
        int stateid = 0;
        for (String state : selectedstate) {
            stateid = Integer.parseInt(state);
            State state1 = implementation.viewStateById(stateid);
            details.getList().add(state1);
        }
        for (String cov : coverage) {
            int covid = Integer.parseInt(cov);
            Coverages coverages = implementation.viewCovById(covid);
            details.getCoverages().add(coverages);
        }
        implementation.savePolicyDetails(details);
        return "index";
    }
}