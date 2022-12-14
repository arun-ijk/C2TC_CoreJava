package com.tnsif.LambdaExpression;

interface NumericTest {
	boolean test(int n);
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		NumericTest isEven = (n)->(n%2==0);
		
		if(isEven.test(10))
			System.out.println("10 is even");
		if(!isEven.test(9))
			System.out.println("9 is odd");
		
		NumericTest isNonNeg = (n)->n>=0;
		
		
		if(isNonNeg.test(1))
			System.out.println("1 is non-negative");
		if(!isNonNeg.test(-1))
			System.out.println("-1 is a negative");
	}

}
