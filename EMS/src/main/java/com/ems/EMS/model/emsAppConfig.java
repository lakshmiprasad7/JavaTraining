package com.ems.EMS.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.ems.EMS")
@PropertySource("classpath:application.properties")
public class emsAppConfig {

//	@Bean
//	public Map<Integer, Employee> empRecords() {
//		Map<Integer, Employee> records = new HashMap<Integer, Employee>();
//		records.put(1, employee());
//		return records;
//	}
//
//@Bean
//public HR hr() {
//	HR hr = new HR();
//	hr.setEmployeeRecords(empRecords());
//	return hr;
//}
//	  @Bean
//	    public Address address() {
//	        Address address = new Address();
//	        address.setStreet("123 Main Street");
//	        address.setCity("New York");
//	        address.setState("NY");
//	        address.setZipcode("10001");
//	        return address;
//	    }
//
//	    // Department Bean
//	    @Bean
//	    public Department department() {
//	        Department department = new Department();
//	        department.setDeptId(101);
//	        department.setDeptName("Engineering");
//	       
//	        return department;
//	    }
//
//	    // List of Skills for Employee
//	    @Bean
//	    public List<String> skills() {
//	        return Arrays.asList("Java", "Spring Boot", "Microservices", "SQL");
//	    }
//
//	    // Employee Bean
//	    @Bean
//	    public Employee employee() {
//	        Employee employee = new Employee();
//	        employee.setId(1);
//	        employee.setName("John Doe");
//	        employee.setEmail("john.doe@example.com");
//	        employee.setPhone("123-456-7890");
//	        employee.setSalary(85000.00);
//	        employee.setDesignation("Software Engineer");
//	        employee.setAddress(address()); // Inject Address
//	        employee.setDepartment(department()); // Inject Department
//	        employee.setSkills(skills()); // Inject Skills List
//	        return employee;
//	    }
//
//		@Bean
//		public payRoll payroll() {
//			payRoll payroll = new payRoll();
//			payroll.setEmployeeId(null);
//			payroll.setBaseSalary(50000);
//			payroll.setBonuses(10000.00);
//			payroll.setDeductions(1000);
//			return payroll;
//
//		}
//
//		@Bean
//		public List<String> projects() {
//			return Arrays.asList("HMS", "EMS", "RMS");
//		}
//
//		@Bean
//		public performance performance() {
//			performance performance = new performance();
//			performance.setEmployeeId(0);
//			performance.setRating(4.5);
//			performance.setFeedback("Good Afroz");
//			performance.setProjectsHandled(projects());
//			performance.setEligibleForPromotion(true);
//			return performance;
//
//		}
//}
	@Value("${address.street}")
	private String street;
	@Value("${address.city}")
	private String city;
	@Value("${address.state}")
	private String state;
	@Value("${address.zipcode}")
	private String zipcode;
	@Bean
	public Address address() {
		Address address=new Address();
		address.setStreet(street);
		address.setCity(city);
		address.setState(state);
		address.setZipcode(zipcode);
		return address;
	}
	@Value("${department.deptId}")
	private int deptId;
	@Value("${department.deptName}")
	private String deptName;
	@Bean 
	public Department department() {
		Department department=new Department();
		department.setDeptId(deptId);
		department.setDeptName(deptName);
		return department;
		
	}
  @Value("{employee.skills}")
  private String skills;
  @Bean
  public List<String> skills(){
	  return Arrays.asList(skills.split(","));
  }
	@Value("${employee.id}")
	private int id;
	@Value("${employee.name}")
	private String name;
	@Value("${employee.email}")
	private String email;
	@Value("${employee.phone}")
	private String phone;
	@Value("${employee.salary}")
	private double salary;
	@Value("${employee.designation}")
	private String designation;
	@Bean
	public Employee employee() {
		Employee employee =new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setEmail(email);
		employee.setPhone(phone);
		employee.setSalary(salary);
		employee.setDesignation(designation);
		employee.setAddress(address());
		employee.setDepartment(department());
	   employee.setSkills(skills());
		return employee;
	}
	 @Value("{performance.projectsHandled}")
	  private String projectsHandled;
	 @Bean
	  public List<String> projectsHandled(){
		  return Arrays.asList(skills.split(","));
	  }
	
	@Value("${performance.employeeId}")
	private int employeeId;
	@Value("${performance.rating}")
	private double rating;
	@Value("${performance.feedback}")
	private String feedback;
	@Value("${performance.eligibleForPromotion}")
	private String eligibleForPromotion;
	@Bean
	public performance performance() {
		performance performance =new performance();
		performance.setEmployeeId(employeeId);
		performance.setRating(rating);
		performance.setFeedback(feedback);
		performance.setProjectsHandled(projectsHandled());
		performance.setEligibleForPromotion(true);
		return performance;
	}

	@Value("${payroll.employeeId}")
	private String employeeId1;

	@Value("${payroll.baseSalary}")
	private double baseSalary;

	@Value("${payroll.bonuses}")
	private double bonuses;

	@Value("${payroll.deductions}")
	private double deductions;

	@Bean
	public payRoll payroll() {
		payRoll payroll = new payRoll();
		payroll.setEmployeeId(employeeId1);
		payroll.setBaseSalary(baseSalary);
		payroll.setBonuses(bonuses);
		payroll.setDeductions(deductions);
		return payroll;
	}
	@Bean
	public Map<Integer, Employee> empRecords(){
		Map<Integer, Employee> records = new HashMap<>();
		records.put(id, employee());
		return records;
	}
	@Bean
	public HR hr() {
		HR hr = new HR();
		hr.setEmployeeRecords(empRecords());
		return hr;
	}
    }