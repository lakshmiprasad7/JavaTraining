package JavaBasics;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance :");
		double distance=sc.nextDouble();
		System.out.println("Enter the type of taxi(standard, suv,premium):");
		String taxitype=sc.next();
		sc.nextLine();
		System.out.println("is it Peak Time:");
		boolean isPeakTime=sc.nextBoolean();
		
		double fare=calculatefare(taxitype,distance,isPeakTime);
		System.out.println(fare);
		
		sc.close();
		
	}

 static double calculatefare(String taxitype, double distance) {
	 double rateperkm;
	 switch(taxitype.toLowerCase()) {
	 case "suv":
		 rateperkm=25.0;
		 break;
	 case "premium":
		 rateperkm=20.0;
		 break;
	 case "standard":
		 rateperkm=10.0;
		 break;
	 default:
		 System.out.println("Invalid taxi type");
		 rateperkm=5.0;
	 }
		return distance*rateperkm;
	}
 static double calculatefare(String taxitype,double distance,boolean isPeakTime) {
	 double fare=calculatefare(taxitype, distance);
	 if(isPeakTime) {
		 fare+=fare*0.10;
	 }
	 return fare;
 }

}
