package com.interviewquestion;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
//			Scanner scan = new Scanner(System.in);
//			
//			System.out.println("Enter the string");
//			
			String str="madam";
			String orgstr=str;
			
			String rev="";
			int len =str.length();
			
			for(int i=len-1; i>=0; i--)
			{
				rev=rev+str.charAt(i);
			}
			
			//System.out.println(rev);
			if(orgstr.equals(rev))
			{
				System.out.println("It is the Palindrome");
			}
			else
			{
				System.out.println("It is not palindrome");
			}
	}

}
