package com.interviewquestion;

public class Swaptwonumberlogic5 {

	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("Before swapping two number"+ a+"  "+b);
		
		//Logic 5 -- Single statement
		
		b=a+b - (a=b);
		
		System.out.println("After swapping two number"+ a+"  "+b);

	}

}
