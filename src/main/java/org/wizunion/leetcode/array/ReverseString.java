package org.wizunion.leetcode.array;

/**
 * Write a function that takes a string as input and returns the string reversed.
 * <p>
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
    public static String reverseString(String str){
        char[] reversed = new char[str.length()];
        char[] arrays = str.toCharArray();
        int len=str.length();
        for(int i=0;i<len;i++){
            reversed[len-i-1]=arrays[i];
        }
        return new String(reversed);
    }
}
