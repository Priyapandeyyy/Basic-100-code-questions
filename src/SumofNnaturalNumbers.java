// It can be solved using three methods :
		
		// Method 1 : Using for Loop
		// Method 2 : Using formula for the sum of nth term
		// Method 3 : Using Recursion

public class SumofFirstNnaturalNumbers {
	public static void main(String[] args) {
		//✨✨ Method 1 : Using for Loop ✨✨
		
//		int n = 10;
//		int sum = 0;
//		
//		for (int i=1; i<=n; i++)
//			sum += i;
//		System.out.println(sum);
		
		// ✨✨ Method 2 : Using formula ✨✨
		
//		int n = 10;
//		System.out.println(n*(n+1)/2);
		
		// ✨✨Method 3 : Using recursion ✨✨
		
		int n = 10;
		int sum = getSum (n);
		
		System.out.println(sum);
	}
	static int getSum (int n)
	{
		if (n==0)
			return n;
		return n + getSum (n-1);
		
		
//		It's same as Sum of first Natural Numbers
	}
}