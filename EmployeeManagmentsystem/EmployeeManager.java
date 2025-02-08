package EmployeeManagmentsystem;

public class EmployeeManager extends FullTimeEmp implements BonusProvided {

	public EmployeeManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeManager(String empname, int empId, String empDept, double basicSalary, int leaveDays, double bonus) {
		super(empname, empId, empDept, basicSalary, leaveDays, bonus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary(double baseSalary) {
		// TODO Auto-generated method stub
		return baseSalary *bonusPercentage;
	}

}
