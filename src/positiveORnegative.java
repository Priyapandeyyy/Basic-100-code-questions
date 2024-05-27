// Question => Check if a number is positive or negative.
// 
// We can solve this question by three methods:
// 1. Using Brute Force
// 2. using Nested if-else
// 3. Using Ternary Operators  // (condition) ? (if true:action) : (if false: action)

// There will also be three condition for this question
//
// 1. If N>0, Number is positive
// 2. If N<0, Number is Negative
// 3. If N=0, Number is zero.


public class positiveORnegative {

	public static void main(String[] args) {
		int num = 0;
		
		// ✨✨ Brute Force ✨✨
//		if (num > 0)
//			System.out.println("The number is positive");
//		else if (num < 0)
//			System.out.println("The number is negative");
//		else
//		System.out.println("zero");
		
		
		// ✨✨ Nested If-else statement ✨✨
		
//		if (num >= 0) {
//			if (num == 0 )
//				System.out.println("zero");
//			else 
//				System.out.println("The number is positive");
//		}
//		else 
//			System.out.println("The number is negative");
		
		
		// ✨✨ Ternary Operator ✨✨
		
		if (num == 0) {
			System.out.println("zero");
		}
		else {
			String result = num > 0 ? "The number is positive" : "The number is negative";
			System.out.println(result);
		}
	}
}
