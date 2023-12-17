package com.learning.main;

public class MergeStringAlt {

	public static void main(String[] args) {

		String finalStr = mergeStrings("a", "p");
		System.out.println(finalStr);
	}
	
	public static String mergeStrings(String word1, String word2) {
		String mergedString = "";
		
		int min = Math.min(word1.length(), word2.length());
		for(int i =0 ; i<min; i++) {
			mergedString += String.valueOf(word1.charAt(i))+ String.valueOf(word2.charAt(i));
		}
		
		if(word1.length() > word2.length()) {
			mergedString += word1.substring(0,min);
			
		}
		if(word1.length() < word2.length()) {
			mergedString += word2.substring(0,min);
		}
		
//		if(word1.length() < word2.length()){
//			String s1 = word2.substring(0,word1.length());
//			String s2 = word2.substring(word1.length());
//			for(int i =0 ; i<word1.length(); i++) {
//				mergedString += String.valueOf(word1.charAt(i)) + String.valueOf(s1.charAt(i));
//			}
//			mergedString += s2; 
//
//			
//		}else {
//			String s2 = word1.substring(word2.length());
//			for(int i =0 ; i<word2.length(); i++) {
//				mergedString += String.valueOf(word1.substring(0,word2.length()).charAt(i)) + String.valueOf(word2.charAt(i));
//			}
//			mergedString += s2; 
//
//		}
		
		
		return mergedString;
	}

}
