package com.company;
import java.util.Scanner;

/**
 * Created by zarekchung on 2017/5/18.
 *
 * Implement a method to  perform basic string compression  using the  counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blcSa3.
 * If the "compressed" string would not become smaller than the orig­ inal string,
 * your method should return the original string.
 */
public class ch1_05 {
    public static void main(String[] args) {


        Scanner sr = new Scanner(System.in);
        String str = sr.next();
        System.out.println(cntStr(str));


    }
    private static String cntStr(String s){
        String sResult="";
        int cnt = 1;
        char str='\u0000';
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==str)
            {
                cnt++;
            }
            else if(i>0)
            {

                sResult +=Integer.toString(cnt);
                cnt =1;
                sResult +=s.charAt(i);
                //sResult +=s.charAt(i);

            }
            else
            {
                sResult +=s.charAt(i);
                //cnt++;
            }

            str = s.charAt(i);
        }
        return sResult;
    }

}
