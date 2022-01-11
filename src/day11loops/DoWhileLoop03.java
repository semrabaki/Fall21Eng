package day11loops;

public class DoWhileLoop03 {
	
/*
	 For the String "1234_?!abcdef", type a code to count the number of letters, 
	 the number of digits and the number of others by using do-while loop
*/

	public static void main(String[] args) {
		
		String s = "1234_?!abcdef";
		
        s = s.toLowerCase();
        
        //1.way
		
		int digitCounter = 0;
		int letterCounter = 0;
		int othersCounter = 0;
		
		int idx = 0;
		
		do {				
			if(s.charAt(idx)>='a' && s.charAt(idx)<='z') {							
				letterCounter++;				
			}else if(s.charAt(idx)>='0' && s.charAt(idx)<='9') {				
				digitCounter++;				
			}else {				
				othersCounter++;				
			}			
			idx++;	
		}while(idx<s.length());
		System.out.println("Letters: " + letterCounter);
		System.out.println("Digits: " + digitCounter);
		System.out.println("Others: " + othersCounter);
		
		
		//2.way
		String t = "A5b6@789cE!";
		
		String justDigits = t.replaceAll("[^0-9]", "");
		System.out.println("Digits: " +justDigits.length());
		
		String justLetters = t.replaceAll("[^a-zA-Z]","");
		System.out.println("Letters: " +justLetters.length());
		
		String diffFromLettersAndDigits = t.replaceAll("[a-zA-Z0-9]", "");
		System.out.println("Number of others:" + diffFromLettersAndDigits.length());

	}

}
