package EmployeeManagmentsystem;
//class InvalidStipendException extends RuntimeException{
//	public InvalidStipendException(String Message) {
//		super(Message);
//	}
//}
public class InternsEmp extends Employee {
private double stipend;

	public InternsEmp() {
	super();
	// TODO Auto-generated constructor stub
}

public InternsEmp(String empname, int empId, String empDept, double basicSalary, int leaveDays,double stipend) {
	super(empname, empId, empDept, basicSalary, leaveDays);
	// TODO Auto-generated constructor stub
//	if(stipend >20000) {
//		throw new InvalidStipendException("Intern stipend cannot be more than 20000");
//	}
	this.stipend=stipend;
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return empname;
}

@Override
public int getId() {
	// TODO Auto-generated method stub
	return empId;
}

@Override
double calculateSalary() {
	// TODO Auto-generated method stub
	return stipend;
}

@Override
String employeeType() {
	// TODO Auto-generated method stub
	return "Intern Emploee";
}

@Override
void provideBenefits() {
	// TODO Auto-generated method stub
	
}

	
}
