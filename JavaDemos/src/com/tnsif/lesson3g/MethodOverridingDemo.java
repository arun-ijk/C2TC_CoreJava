//program to demonstrate Method overriding
package com.tnsif.lesson3g;

//Parent class
class OneA {
	Integer number = 8865;
	 void dispOutput(Integer aadharNumber){
		System.out.println("I am class One and valus is "+aadharNumber); // 10
	}
}
//Child class
class TwoA extends OneA {
	void dispOutput(Integer speed) {
		super.dispOutput(number);
		//super.dispOutput(8888);
		System.out.println("I am class Two and value is "+speed); //100
	}
	
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoA obj = new TwoA();
		obj.dispOutput(100); 

	}

}