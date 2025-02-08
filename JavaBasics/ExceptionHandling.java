package JavaBasics;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a, b;
		int [] arr = {10, 20, 30, 40};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a: ");
//		a = sc.nextInt();
//		System.out.println("Enter b: ");
//		b = sc.nextInt();
// 
		try {
//			int result = a/b;
//			System.out.println("Result: " + result);
			System.out.println(arr[4]);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		finally {
			System.out.println("-----------");
			//close the resources
		}
	}
 

}
