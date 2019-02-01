package Simple_program;

import org.omg.Messaging.SyncScopeHelper;

public class String_method {

	public static void main(String[] args) {
		String s1="    hi damini here";
		String s2 ="RBT";
		String s3="";
		String s4= new String("Hello");
		int i=20;
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(3));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("m"));
		System.out.println(s1.contains("f"));
		System.out.println(s1.endsWith("i"));
		System.out.println(s1.endsWith("f"));
		System.out.println(s1.equals(s2));
		System.out.println( s1.equalsIgnoreCase(s2));
		System.out.println(s1.indexOf("damini"));
		System.out.println(s4.intern());
		System.out.println(s3.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.replace("here","welcome"));
		System.out.println(s2.replaceAll("RBT", "Company"));
		System.out.println(s1.substring(4));
		System.out.println(s1.toCharArray());
		System.out.println(s1.trim());
		System.out.println(s1.valueOf(i));
		
		
		

	}

}
