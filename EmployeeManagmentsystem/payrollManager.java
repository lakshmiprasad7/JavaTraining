package EmployeeManagmentsystem;

public class payrollManager {
public static  void generatePayroll(Employee emp) {
	double salary=emp.calculateSalary();
	double tax=(emp instanceof Taxiable )?((Taxiable)emp).calculateTax(salary):0.0;
	double netsalary=salary-tax;
	System.out.println("payroll for:"+emp.getEmpname());
	System.out.println("Monthly salary"+salary);
	System.out.println("tax deduction "+tax);
	System.out.println("net salary :"+netsalary);
}
}
