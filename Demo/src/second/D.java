package second;



import java.util.ArrayList;

import first.B;

public class D extends B{

	
	
public static void main(String args[]) {
	
	
	String name="Golla Rama Krishna";
	
	String reversename="";
	
	for(int i=0; i<name.length(); i++) {		
		
		if(name.charAt(i)!=' ') {
			reversename =name.charAt(i)+reversename;
		}
		
		
		}
		
		System.out.println(reversename);
	}
	
	}
	
	
	
