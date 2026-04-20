package com.interviewquestion;

public class Evenorodd {

	public static void main(String[] args) {
		
		int a[]= {32,4,22,56,5,8,13,77,33,5};
		
		System.out.println("Even Number");
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
			
		}
		
		System.out.println("Odd Number");
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
			
		}
	}

}
