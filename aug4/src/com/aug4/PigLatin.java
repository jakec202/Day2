package com.aug4;

import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String convertedWord = sc.nextLine();
		
		char[] endings = {'a','y'};
		char[] vowel = {'a','e','i','o','u'};
		char[] vowelEnding = {'y','a','y'};
		
		
		System.out.println("What word would you like in Pig Latin?");
		String userinput = sc.nextLine();
		
//		System.out.println(userinput);
		StringBuilder modUserInput = new StringBuilder(userinput.toLowerCase());
		char firstLetter = modUserInput.charAt(0);
		char deleteFirstLetter = modUserInput.charAt(0);
		modUserInput.deleteCharAt(0);
			

//		if (firstLetter == ('a'||'A'||'e'||'E'||'i'||'I'||'o'||'O'||'u'||'U')) {
//			userinput.vowelEnding
//			System.out.println();		
		
		
		
		modUserInput.append(firstLetter).append(endings);
		System.out.println(modUserInput );}}
				
	
	
//	public static boolean firstLetterAVowel(char firstLetter) 
//		{char []vowel = {'a','e','i','o','u'};
//		boolean isThisAVowel = false;
//		return;
//			for (int i = )
//		
//	
//	public static void 
//		
//	 char[] vowel ={'a','e','i','o','u'};
//	 if vowel != firstLetter then 
//	 char firstLetter = modUserInput.charAt(0);
//	 return;
//	
