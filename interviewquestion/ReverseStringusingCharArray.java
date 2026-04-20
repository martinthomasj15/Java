package com.interviewquestion;

public class ReverseStringusingCharArray {

	public static void main(String[] args) {
		
		String str="Martin";
		String rev ="";
		
		char a[]= str.toCharArray(); // Convert string into a character Array 
		int len =a.length;
		
		for(int i=len-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println(rev);
		
	}

}
