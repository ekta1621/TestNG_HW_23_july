package com.java17_selenium.my_first_maven_project;

public class Day_Homework {

	public static void main(String[] args) {
		int i = 10; //latest value is 10
		
		int j = --i - i++;
				// 9 - 10  = -1 latest value of j is -1
		                           // latest value of i is 9
		
		int k = i-- - --i + i++ - --j;
		
		// k = 9    - 8  +  7   -  -2 : latest value of k is 10
		// i = 8       7       8          : latest value of i is 8
		// j =                          -2 : latest value of j is -2  
		
		int l = i++ + j++ + --j - --k - --i;
		
			//l = 9   + -3   +   -2 - 9  - 8 : l = -13
		
		
		
		
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
