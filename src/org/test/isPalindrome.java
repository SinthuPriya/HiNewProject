package org.test;

public class isPalindrome {
	
	public static void isPalindrome(int num) {
		 int r= 0;
		 int sum =0;
		 int t = num;
		 while(num>0) {
			 r = num%10;
			 sum = (sum*10)+r;
			 num = num/10;
			 
		 }
		 if(t==sum) {
			 System.out.println("palindrome");
		 }
		 else {
			 System.out.println("not a palindrome");
		 }
	}
	public static void main(String[] args) {
		isPalindrome(151);
	}

}
