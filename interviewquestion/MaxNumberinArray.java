package com.interviewquestion;

public class MaxNumberinArray {

	public static void main(String[] args) {
		
		//Finding maximum number in Array 
		
		int a[]= {2,8,10,20,56,87,45};
		
		int max=a[0];
		
		for(int i=1; i<a.length; i++) // 87>45
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
	}

}
