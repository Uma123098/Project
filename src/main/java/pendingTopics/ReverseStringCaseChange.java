package pendingTopics;

public class ReverseStringCaseChange {

	public static void main(String[] args) {
		
		String str = "Selenium Automation";
		str = str.toLowerCase();
		System.out.println(str);
		String[] str1 = str.split(" ");
		String actualString="";
		
		for (String string : str1) {
			String newString="";
			for(int i=string.length()-1; i>=0; i--){
				if(i==string.length()-1){
					newString=newString+string.charAt(i);
					newString=newString.toUpperCase();
				}else{
				newString=newString+string.charAt(i);
				}
			}
			
			actualString = actualString+newString+" ";
		}
		 System.out.println(actualString);
				
	}

}
