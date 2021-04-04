package pendingTopics;

public class Strings {

	public static void main(String[] args) {
	
		//string stores in same memory
		String a="Selenium";
		System.out.println(a.hashCode());
		
		String b=new String("Selenium");
		System.out.println(b.hashCode());
		
		//string buffer stores in seperate memory
		StringBuffer sb= new StringBuffer("Selenium1");
		System.out.println(sb.hashCode());
		StringBuffer sb1=new StringBuffer("Selenium");
		System.out.println(sb1.hashCode());
		
		long startTime=System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append("Training");
		}	
		long endTime=System.currentTimeMillis();
		System.out.println("Time taken by String buffer to complete the action is"+(endTime-startTime)+ "  ms");
		
		//string builder also stores in seperate memory but faster than string buffer
		StringBuilder sb2= new StringBuilder("Selenium2");
		System.out.println(sb2.hashCode());
		StringBuilder sb3=new StringBuilder("Selenium3");
		System.out.println(sb3.hashCode());
		
		long startTime1=System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb2.append("Training");
		}	
		long endTime1=System.currentTimeMillis();
		System.out.println("Time taken by String builder to complete the action is"+(endTime1-startTime1)+ "  ms");
		
	}
	
}
