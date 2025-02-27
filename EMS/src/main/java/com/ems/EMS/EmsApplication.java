package com.ems.EMS;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ems.EMS.model.emsAppConfig;
import com.ems.EMS.service.EmployeeService;
import com.ems.EMS.service.HRService;
import com.ems.EMS.service.PerformanceService;
import com.ems.EMS.service.payRollService;

@SpringBootApplication
public class EmsApplication {

	public static void main(String[] args) {
//        SpringApplication.run(EmsApplication.class, args);

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(emsAppConfig.class)) {
			EmployeeService empService = context.getBean(EmployeeService.class);
			empService.printEmpDetails();
			System.out.println("Annual Salary: " + empService.calAnnualSalary());
			HRService hrService = context.getBean(HRService.class);
			System.out.println(hrService.getEmpById(2));
			payRollService prs=context.getBean(payRollService.class);
			prs.printPayRollService();
			PerformanceService ps=context.getBean(PerformanceService.class);
			ps.listAllProjects();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
