package com.test.priya;

import java.util.Scanner;

public class Polindrome1 {

	public static void main(String[] args) {
String words;
Scanner in = new Scanner(System.in);

System.out.println("Type a String");
		words = in.nextLine();
		int length = words.length();
		int i, begin, end, middle;
		 begin = 0;
		end = length-1;
		middle = (begin+end)/2;
		for(i= begin; i<=end; i++){
			if(words.charAt(begin)== words.charAt(end)){
	         begin++;
	         end--;
			}else{
				break;
			}
		}
			if(i== middle+1){
				System.out.println("String is a polindrome");
			}else{
				System.out.println("String is not a polindrome");
			}
	         
}
}

