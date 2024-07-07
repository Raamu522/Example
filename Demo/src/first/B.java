package first;

public class B {
	
	public static void main(String[] args) {
		
		
		String name="Selenium";
		
		String name1=name.toLowerCase();
		
        String name2="";
		
		for(int i=0; i<name1.length();i++) {
			
			if(name1.charAt(i)>='a'&&name1.charAt(i)<='z') {
				
				name2=name2+name1.charAt(i);
			}
		}
		System.out.println(name2);
		
	}
	
		
		
	}
	
	
