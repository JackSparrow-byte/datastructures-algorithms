package com.ds.strings;

public class StringReverseInRecursive
{
    public static void main(String[] args) 
    {
        String blogName = "Aravind";
         
        String reverseString = recursiveSwap(blogName);
         
        System.out.println(reverseString);
    }
     
    static String recursiveSwap(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
         return recursiveSwap(str.substring(1)) + str.charAt(0);
    }
}
