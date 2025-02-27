package com.ems.EMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.EMS.model.payRoll;
@Service
public class payRollService {
	@Autowired
public payRoll payroll;
    public double calculateNetSalary() {
        return payroll.calculateSalary();
    }

    // Print payroll service details
    public void printPayRollService() {
        System.out.println("Payroll Service Details: " + payroll.toString());
    }
}
