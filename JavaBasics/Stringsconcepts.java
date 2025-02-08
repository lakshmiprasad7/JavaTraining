package JavaBasics;

public class Stringsconcepts {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		System.out.println("Enter the password:");
//		String pwd=sc.nextLine();
//		
//		String notedpwd="Admin";
//		if(pwd.equalsIgnoreCase(notedpwd)) {
//			System.out.println("Login successful");
//		}
//		else {
//			System.out.println("Invalid");
//		}
//		sc.close();
	StringBuffer sd =new StringBuffer("java");
	System.out.println(sd);
	sd.append("Programing");
	sd.insert(4, " is the best ");
	System.out.println(sd);
	sd.replace(12, 16, "good");
	System.out.println(sd);
	sd.substring(3,5);
	System.out.println(sd);
	String email="bunty@gamil.com";
	email.endsWith(".com");
	 
	
	
	
	}

}
