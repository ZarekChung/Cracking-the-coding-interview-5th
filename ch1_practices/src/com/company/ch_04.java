package com.company;

import java.io.*;
import java.util.Scanner;
/**
 * Created by zarekchung on 2017/5/18.
 * psvm + Tab
 */
public class ch_04 {
    public static void main(String[] args) throws IOException{
        System.out.println("Please inter a string");
        //it works for BufferedReader
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String text = buf.readLine();
        char[] charArray= text.toCharArray();

        //it doesn't work for scanner
        //Scanner scanner = new Scanner(System.in);
        //char[] charArray= (scanner.next()).toCharArray();

        String s ="%20";

        System.out.println(BulidResult(charArray,s));
    }
    private static String BulidResult(char[] cInput,String sReplace)
    {
        String sResult="";
        for (int i = 0; i <cInput.length ; i++) {
            if(" ".equals(Character.toString(cInput[i])))
            {
                sResult += sReplace;
                // charArray[i]=s.charAt(1);
            }
            else
            {
                sResult += String.valueOf(cInput[i]);
            }
        }
        return sResult;
    }
}
