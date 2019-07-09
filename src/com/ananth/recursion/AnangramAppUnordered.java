package com.ananth.recursion;
//Anagram using substring
public class AnangramAppUnordered {
	
	public static void main(String[] args)	{
		anag("CAT", "");
	}

	public static void anag(String string, String permutation)	{
		if(string.length() == 0)	{
			System.out.println(permutation);
		}
		for(int i = 0; i < string.length(); i++)	{
			char toAppendToPermutation = string.charAt(i);
			String remaining = string.substring(0, i) + string.substring(i + 1);
			anag(remaining, permutation + toAppendToPermutation);
		}
	}

}
