package com.interviewquestion;

public class Swaptwonumberlogic4 {

	public static void main(String[] args) {
		
		int a=10,  b=20;
		System.out.println("Before swapping two number"+ a+"  "+b);
		
		
		//Logic4  -- XOR(^)
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After swapping two number"+ a+"  "+b);

	}

}
