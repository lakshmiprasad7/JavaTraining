package JavaBasics;

import java.util.Scanner;

public class EmployeeRecord3D {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of students:");
  int numStu=sc.nextInt();
  System.out.println("Enter the number of subjects:");
  int numSub=sc.nextInt();
  System.out.println("Enter the number of years:");
  int numYears=sc.nextInt();
  int[][][] record =new int[numStu][numSub][numYears];
  
  System.out.println("enter the marks of each student:");
  for(int s=0;s<numStu;s++) {
	  System.out.println("student"+(s+1)+":");
	  for(int y=0;y<numYears;y++) {
		  System.out.println("year"+(y+1)+":");
		  for(int sub=0;sub<numSub;sub++) {
			  while(true) {
			  System.out.println("Enter marks for subject"+(sub+1)+":");
			  int mark=sc.nextInt();
			  
			  if(mark>=0 && mark<=100) {
				  record[s][sub][y]=mark;
				  break;
			  }else {
				  System.out.println("Invalid input ,please enter the marks between 0 and 100");
			  }
			  }
		  }
	  }
  }
  System.out.println("The student with year wise Percentage Details:");
  
    for(int s=0;s<numStu;s++) {
    	for(int y=0;y<numYears;y++) {
    		int totalMarks=0;
    		for(int sub=0;sub<numSub;sub++) {
    			totalMarks+=record[s][sub][y];
    		}
    		double percentage=(double) totalMarks/(numSub*100)*100;
    		System.out.printf("Year %d: %.2f%%\n",(y+1),percentage);
    	}
    	System.out.println();
    }
  
  sc.close();
  
  
	}

}
