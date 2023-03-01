package com.smr.testing;

public class String_Functions {

	public static void main(String[] args) {
		
		String m = "Java is simple programming language";
		String n = "Java is 100% oops";
		
		int length = m.length();
		System.out.println(length);
		
		boolean equals = m.equals(n);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = m.equalsIgnoreCase(n);
		System.out.println(equalsIgnoreCase);
		
		String UpperCase = m.toUpperCase();
		System.out.println(UpperCase);
		
		String LowerCase = m.toLowerCase();
		System.out.println(LowerCase);
		
		char charAt = m.charAt(25);
		System.out.println(charAt);
		
		int indexOf = m.indexOf('J');
		System.out.println(indexOf);
		
		int lastIndexOf = m.lastIndexOf('e');
		System.out.println(lastIndexOf);
		
		boolean contains = m.contains("s");
		System.out.println(contains);
		
		boolean startsWith = m.startsWith("Jav");
		System.out.println(startsWith);
		
		boolean endsWith = m.endsWith("simple");
		System.out.println(endsWith);	
	}
}
