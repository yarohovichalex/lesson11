package by.htp.lesson11;

import java.util.Random;

public class MainApp {

	public static void main(String[] args) {
		String str = "Hello world my world my aa bb aa aa bb";
		String str3 = "nasdfasdddaz";
		
//		String []arr = new String[9];
//		arr = characterReplacement(9, 2, str, 'Z');
//		System.out.println(arr[1]);
		//System.out.println(two(3,str, "ZZZZ"));
		
		five();
		
		
	}
	
	
	public static String[] characterReplacement(int numberOfWords, int numbersOfChars, String str, char ch) {
		String[] arrString = new String [numberOfWords];
		 for (int i = 0; i<arrString.length; i++) {
			 int l = 0;
			 for(String myStr: str.split(" ")) {
				 
				 arrString[l] = myStr;
				 l++;
			 }
		 }
		 String [] oldArrString = arrString;
		 for (int j = 0; j < arrString.length; j++) {
			if(arrString[j].length() > numbersOfChars) {
				char[] arrChar = new char[arrString[j].length()];
				for (int k = 0; k < arrChar.length; k++) {
					 arrChar[k] = arrString[j].charAt(k);
					 if(k == numbersOfChars){
						 arrChar[k] = ch;
					 }
			}
				arrString[j] = new String(arrChar);
				
		}			 	 
		 
	}
		 return arrString;
	}
	public static String two(int k,String string, String insertString) {
		StringBuilder sb = new StringBuilder(string);
		sb.insert(k, insertString);
		return new String(sb);	
		
	}
	public static void three(String string) {
		int count = string.split(" +").length;
		String [] stringArr = new String [count];
		int [] repetitionOfWords = new int[count];
		stringArr = string.split(" ");
		for (int i = 0; i < stringArr.length; i++) {
			for (int j = 0; j < stringArr.length; j++) {
				if(stringArr[i].equals(stringArr[j])) {
					repetitionOfWords[i] += 1;
				}
			}
		}		
	}
	
	public static String four(String string){
		int maxDistanceBetweenCharacters = 0;
		int startOfSubstring = 0;
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < string.length(); j++) {
				if(string.charAt(i) == (string.charAt(j)) && (j - i) > maxDistanceBetweenCharacters) {
					maxDistanceBetweenCharacters = j;
					startOfSubstring = i;
				}
			}			
		}
		StringBuilder sb = new StringBuilder(string);
		sb.delete(startOfSubstring, maxDistanceBetweenCharacters + 1);
		return new String(sb);
	}
	//result += Character.toString(b[i]);
	public static void five() {
		char [] ch = new char[1000000];
		String resultStr = "";
		StringBuilder resultSb = new StringBuilder("");
		Random random = new Random();
		String exempleStr = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < 1000000; i++) {
			ch[i] = exempleStr.charAt(random.nextInt(26));
		}
//		for (int j = 0; j < 1000000; j++) {
//			resultSb = resultSb.append(Character.toString(ch[j]));
//		}
		for (int j = 0; j < 100000; j++) {
			resultStr += Character.toString(ch[j]);
		}
		System.out.println("finish");
	}
	
	
}

