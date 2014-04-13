package main;

import java.math.BigInteger;

public class Euler16 {
	
	public static void main(String args[]) {
		
		BigInteger sum = new BigInteger("2");
		
		String s = "" + sum.pow(1000);
		
		long x = 0L;
		
		for(int i = 0; i < s.length(); i++) {
			String p = "" + s.charAt(i);
			int z = Integer.parseInt(p);
			x += z;
		}
		
		System.out.println(x);
	}
	
}
