package com.learning.main;

import java.util.HashMap;

public class RomanToNumber {
//	private String[] romanLetters = {"I","V","X","L","C","D","M"};

	public static void main(String[] args) {

		Integer result = romanToNum("MCMXCIV");
		System.out.println(result);
	}

	public static Integer romanToNum(String str) {
		HashMap<String, Integer> romanMap = new HashMap<String, Integer>();

		String[] str1 = str.split("");

		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
		int result = 0;
		int nxt, curr;
		
		for (int i = 0; i < str1.length; i++) {
			curr = romanMap.get(str1[i]);
			if (i + 1 < str1.length) {
				nxt = romanMap.get(str1[i + 1]);
				if (curr < nxt) {
					result = result + nxt - curr;
					i++;
				}else
				result = result + curr;
				
			} else
				result = result + curr;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String[] strArr = str.split("");
//		Integer curr;
//		Integer nxt;
//
//		for (int i = 0; i < strArr.length; i++) {
//			curr = romanMap.get(strArr[i]);
//			if (i + 1 < strArr.length) {
//				
//				nxt = romanMap.get(strArr[i + 1]);
//				if ( curr < nxt) {
//					result = result + nxt - curr;
//					i++;
//				} else {
//					result = result + curr;
//				}
////			System.out.println(romanMap.get(strArr[i]));
//			}else {
//				result = result + curr;
//
//			}
//		}

		return result;
	}

}
