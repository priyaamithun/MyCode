package com.test.priya;

public class patterns4 {
public static void main (String []args){
	char i;
	char j;
	 for( i='A'; i<='E'; i++){
		 for( j='A';j<='E';j++){
			 System.out.print(j);
		 }
		 System.out.println();
		 
}
	 
	 for(int a=5;a>=1;a--){
		 for(int b=1;b<=5;b++){
			 System.out.print(a);
		 }
		 System.out.println();
	 }
	 for(int a=5;a>=1;a--){
		for(int b=5;b>=1;b--){
			System.out.print(b);
		}
		System.out.println();
	 }
for(i='E';i>='A';i--){
	for(j='A';j<='E';j++){
		System.out.print(i);
	}
	System.out.println();
	
}
for(i='E';i>='A';i--){
	for(j='E';j>='A';j--){
		System.out.print(j);
	}
	System.out.println();
	
}
for(int m=1; m<=5; m++){
	for( int n=1;n<=m;n++){
		System.out.print(m);
	}
	System.out.println();
}

for(int m=1;m<=5;m++){
	for(int n=1;n<=m;n++){
		System.out.print(n);
	}
	System.out.println();
}

for(i='A';i<='E';i++){
	for(j='A';j<=i;j++){
		System.out.print(j);
	}
	System.out.println();
}
for( int m=1;m<=5;m++){
	for( int n=5;n>=m;n--){
		System.out.print("*");
		
	}System.out.println();
}



}


}