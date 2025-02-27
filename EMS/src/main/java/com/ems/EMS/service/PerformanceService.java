package com.ems.EMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.EMS.model.performance;
@Service
public class PerformanceService {
@Autowired
performance performance;
    public boolean isEligibleForPromotion() {
        return performance.isEligibleForPromotion();
    }

    public void listAllProjects() {
        System.out.println("Projects Handled: " + performance.getProjectsHandled());
    }

    public void printFeedback() {
        System.out.println("Feedback: " + performance.getFeedback());
    }
}
