package JavaBasics;

import java.util.Scanner;

public class EmployeeRecords {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of Employee:");
   int numEmp=sc.nextInt();
   sc.nextLine();
   
   String[] names =new String[numEmp];
   String[] address=new String[numEmp];
   Double[] salary=new Double[numEmp];
   
   System.out.println("Enter Employee Details:");
   for(int i=0;i<numEmp;i++) {
	   System.out.println("Employee"+(i+1)+":");
	   System.out.println("Name:");
	   names[i]=sc.nextLine();
	   System.out.println("Address:");
	   address[i]=sc.nextLine();
	   System.out.println("Salary:");
	   salary[i]=sc.nextDouble();
	   sc.nextLine();
	   System.out.println();
   }
   System.out.println("\n Employee Salary Details (After 3 Months):");
   System.out.println("---------------------------------------------");
   System.out.printf("%-15s %-20s %-10s %-10s\n","Name","Address","Salary","Total");
   System.out.println("---------------------------------------------");
   
   
   double totalSal= 0;
   for(int i=0;i<numEmp;i++) {
	  
	  double salaryAfter3Months  = salary[i]*3;
	  System.out.printf("%-15s %-25s %-10.2f %-10.2f\n",names[i],address[i],salary[i],salaryAfter3Months);
	  totalSal += salaryAfter3Months;
   }
  System.out.println("------------------------------------------------");
System.out.printf("The Total Salary Paid: %.2f\n",totalSal);
sc.close();
   
   
	}

}
