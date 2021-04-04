package pendingTopics;

public class StringOppositeCase {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer("Hello World");
		
		int ln=sb.length();
		
		for (int i = 0; i < ln; i++) {
			Character c = sb.charAt(i);
			
			if(Character.isLowerCase(c))
				sb.replace(i, i+1, Character.toUpperCase(c)+ "");
			else
				sb.replace(i, i+1, Character.toLowerCase(c)+ "");
		}
		
		System.out.println(sb);
	}

}
