package com.test.priya;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class A {
	public void test(){
		
		System.out.println("method A");
	}
	public static void main (String [] args){
		int index = 1;
		Boolean [] test = new Boolean [3];
		Boolean data = test[index];
		System.out.println(data);
		
		
		String str = "example";
		System.out.println(str.substring(2,4));

	int arr[]= {1,2,3,4};
	
	call_array(arr[0],arr);
	System.out.println(arr[0]+","+arr[1]);
		
		
		
}
	private static void call_array(int i, int arr[]) {
		arr[i]=6;
		i=5;
	}
	
	
	
	
}