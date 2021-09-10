package com.Ex26;

public class Main {

	public static void main(String[] args) {
		
	    String  primos = "";
	    int i =0;
		int num =0;

	    for (i = 1; i <= 123; i++){ 		  	  
	    	int count=0; 	  
	        for(num =i; num>=1; num--){
	           if(i%num== 0){
	        	   count = count + 1;
		       }
	        }
		  if (count == 2){
			  primos = primos + i + " ";
		  }	
	    }	
	       System.out.println("Os números primos de 1 a 123 são :");
	       System.out.println(primos);
	}
	
}
