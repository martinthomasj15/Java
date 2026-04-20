	package com.interviewquestion;

public class MinNumberinArray {

	public static void main(String[] args) {


		int a[]= {2,8,10,20,56,87,45};
		
		int min=a[0]; //2
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}

		System.out.println(min);
		
	}

}
