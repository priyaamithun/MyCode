package com.test.priya;

public class patterns {
public static void main (String []args){
	int n=5;
	int z=1;
	
	for(int i=1;i<=5;i++){
		for(int j=5; j>=i;j--){
			System.out.print("*");
		}
	System.out.println();
	
}

for(int i =1;i<=n;i++){
	for(int j=n-1;j>=i;j--){
		System.out.print(" ");
	}
	for(int k=1;k<=z;k++){
		System.out.print("*");
	}
z++;
System.out.println();

}









}
}