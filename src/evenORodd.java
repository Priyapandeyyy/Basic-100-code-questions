// We can solve this problem using three methods :
// 1. Brute Force
// 2. Ternary Operator
// 3. Bitwise Operator

public class evenORodd {

	public static void main(String[] args) {
		 int number = 28;
		 
		 // By Brute Force
//		 if(number%2 == 0) {
//			 System.out.println(number + " is even");
//		 } else {
//			 System.out.println(number + " is odd");
//		 }
		 
		 
		 // By Ternary Operator
		 
		 String result = number % 2 == 0 ? " is even" : " is odd";
		 System.out.println(number + result);
	}
}
