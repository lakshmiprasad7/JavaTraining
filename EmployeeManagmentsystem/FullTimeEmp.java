package EmployeeManagmentsystem;

public class FullTimeEmp extends Employee implements Taxiable,Workhours{

	public FullTimeEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FullTimeEmp(String empname, int empId, String empDept, double basicSalary, int leaveDays,double bonus) {
		super(empname, empId, empDept, basicSalary, leaveDays);
		// TODO Auto-generated constructor stub
		this.bonus=bonus;
		
	}
	
	
    private double bonus;
  

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
	public int getWorkhours() {
		// TODO Auto-generated method stub
		return standaradworkhours;
	}

	@Override
	public double calculateTax(double salary) {
		// TODO Auto-generated method stub
		return salary*0.20;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return basicSalary*bonus;
	}

	@Override
	String employeeType() {
		// TODO Auto-generated method stub
		return "Full Time Employee";
	}

	@Override
	void provideBenefits() {
		// TODO Auto-generated method stub
		System.out.println("Health insurance,Provident Fund");
	}
	
}
