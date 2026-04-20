package com.interviewquestion;

public class Swaptwonumberlogic1 {

	public static void main(String[] args) {
		
		int a = 10, b=20;
		System.out.println("Before swapping two number"+ a+"  "+b);
		
		//Logic 1 -- Using third variable 
		int t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping two number"+ a+"  "+b);
		

	}

}
