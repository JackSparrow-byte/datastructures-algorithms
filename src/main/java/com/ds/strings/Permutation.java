package com.ds.strings;

import java.util.HashSet;
import java.util.Set;

public class Permutation {
	
	public static void main(String[] args) {
		
		System.out.println(getPermutations("ABC"));
	}
	
	public static Set<String> getPermutations(String string) 
    {
        //All permutations
        Set<String> permutationsSet = new HashSet<>();
         
        // invalid strings
        if (string == null || string.length() == 0) 
        {
            permutationsSet.add("");
        } 
        else
        {
            //First character in String
            char initial = string.charAt(0); 
             
            //Full string without first character
            String rem = string.substring(1); 
             
            //Recursive call
            Set<String> wordSet = getPermutations(rem);
             
            for (String word : wordSet) {
                for (int i = 0; i <= word.length(); i++) {
                    permutationsSet.add(charInsertAt(word, initial, i));
                }
            }
        }
        return permutationsSet;
    }
 
    public static String charInsertAt(String str, char c, int position) 
    {
        String begin = str.substring(0, position);
        String end = str.substring(position);
        return begin + c + end;
    }			

}
