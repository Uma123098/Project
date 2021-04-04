package pendingTopics;

public class StringSplit {

	public static void main(String[] args) {
		
		StringBuffer s =new StringBuffer("A1!B2@c3#");
		
		StringBuffer alphabet = new StringBuffer();
		StringBuffer number = new StringBuffer();
		StringBuffer character = new StringBuffer();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isDigit(s.charAt(i))) 
				number.append(s.charAt(i));
			else if (Character.isAlphabetic(s.charAt(i))) 
				alphabet.append(s.charAt(i));
			else 
				character.append(s.charAt(i));
		}
		
		System.out.println("Alphabets in given string :"+alphabet);
		System.out.println("Numbers in given string :"+number);
		System.out.println("Characters in given string :"+character);
				
	}
}
