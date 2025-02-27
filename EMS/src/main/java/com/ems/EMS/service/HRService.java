package com.ems.EMS.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.EMS.model.Employee;
import com.ems.EMS.model.HR;
@Service
public class HRService {
	@Autowired
public HR hr;
	//display all employees
//	fetch emp by id
	public Employee getEmpById(int id) {
		Map<Integer,Employee> mapRecords=hr.getEmployeeRecords();
		return mapRecords.getOrDefault(mapRecords, null);
	}
}
