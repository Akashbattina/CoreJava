package com.edu;

public class BufferArray {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Akash");
		String str1 = "arun";
		String str2 = "hello";
		System.out.println(s);
		System.out.println("Length od string is :" + s.length());
		System.out.println("Char :"+s.charAt(2));
		System.out.println("Last index :"+s.lastIndexOf(str2));
		System.out.println("Capcity :"+s.capacity());
		System.out.println("substring:"+s.substring(3));
		System.out.println("reverse :"+s.reverse());
		
	}

}
