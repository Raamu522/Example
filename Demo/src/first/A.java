package first;

class A {
	
public static void main(String[] args) {
	
	String name="Selenium123";
	
	String name1=name.toLowerCase();
	
	System.out.println(name1);
	
	int count=0;
	
	String name2="";
	String name3="";
	
	for(int i=0; i<name1.length(); i++) {
		
		
		if(name1.charAt(i)>='a' && name1.charAt(i)<='z') {
			
			
			
			
			count++;
			name3=name3+name1.charAt(i);
		}
		
		else {
			
			name2=name2+name1.charAt(i);
		}
	}
	
	System.out.println(count+name2);
		
	}
}
	
	

	
	

		
	

