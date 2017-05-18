package com.company;

/*
* 1.1	Implement an algorithm to determine if a string has all unique characters.
* What if you cannot use additional data structures?
* */
public class Main {

    public static void main(String[] args) {
        String s = "s";
        System.out.println(checkUnique(s));

    }

    private static String checkUnique(String s)
    {
        String sResult="string all unique characters!!";
        char[] charArray=s.toCharArray();

        for(int i=0; i<s.length();i++)
        {
            for(int j=0;j!=i&&j<s.length();j++)
            {
                if(charArray[i]==charArray[j]) {
                    sResult="string has same characters!!";
                    break;
                }
            }
        }
        return sResult;
    }
}
