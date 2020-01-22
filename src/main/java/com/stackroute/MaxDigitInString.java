package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxDigitInString {

	public static int getMaxDigit(String alphanumeric) {
		char [] chrArr = alphanumeric.toCharArray();
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < chrArr.length; i++) {
			if(Character.isDigit(chrArr[i])) {
				int num = chrArr[i] - '0';
				intList.add(num);
			}
		}
		if(intList.size()>0) {
			Collections.sort(intList);
			return intList.get(intList.size()-1);
		}
		
		return 0;
	}

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
    	//Use Scanner to get input from console
    	Scanner sc = new Scanner(System.in);
		String regNumber = sc.nextLine();
		int res = getMaxDigit(regNumber);
		if(res>0) {
		System.out.println("Max digit:"+res);
		}else {
			System.out.println("No digits in string");
		}
 
    
    }
}
