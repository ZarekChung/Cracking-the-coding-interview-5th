package com.company;
import java.util.Arrays;
/**
 * Created by zarekChung on 2017/5/17.
 * 1.3	Given two strings, write a method to decide if one is permutation of the other

 */
public class ch1_03 {
    public static void main(String[] args) {
        String s1 = "abcdet";
        String s2 = "acbed";

        if(checkPermutation(s1,s2))
            System.out.print("one is permutation of the other");
        else
            System.out.println("one is not permutation of the other!!");



    }
    private static boolean checkPermutation(String a1,String a2)
    {
        char[] cArray1=a1.toCharArray();
        char[] cArray2=a2.toCharArray();

       Arrays.sort(cArray1);
        //checArray(cArray1);
       Arrays.sort(cArray2);
       return  Arrays.equals(cArray1,cArray2);
    }
    /*
    private static void checArray(char[] ch)
    {
        for (int i = 0; i <ch.length ; i++) {
            System.out.println(ch[i]);
        }
    }
    */
}
