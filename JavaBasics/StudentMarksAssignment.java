package JavaBasics;

import java.util.Scanner;

public class StudentMarksAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int numStu = sc.nextInt();
		System.out.println("Enter the number of subjects:");
		int numSub = sc.nextInt();
		int[][]  marks= new int[numStu][numSub];
		
		System.out.println("Enter the marks of each student:");
		
		for(int i=0;i<numStu;i++) {
			System.out.println("student"+(i+1)+":");
			for(int j=0;j<numSub;j++) {
				System.out.print("Enter the marks for subject"+(j+1)+":");
				marks[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Percentage of marks for each student:");
		for(int i=0;i<numStu;i++) {
			int totalMarks=0;
			for(int j=0;j<numSub;j++) {
				totalMarks+=marks[i][j];
			}
			double percentage=(double) totalMarks/(numSub*100)*100;
			System.out.printf("student %d: %.2f%%\n",(i+1),percentage);
		}
		sc.close();
		
	}

}
