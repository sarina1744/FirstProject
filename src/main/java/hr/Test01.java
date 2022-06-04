package hr;

import java.util.*;
import java.io.*;
import java.lang.Math;

public class Test01 {
    //sample input
    //abcabcgfeke   --denotes string S
    public static String rearrangeLetters(String S) {

        //this is default OUTPUT. You can change it.
        String result = "";
        int temp;

        //write your Logic here:
        char charArray[] = S.toCharArray();
//        System.out.println("received array:  "+ charArray);
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = (char) temp;
                }
            }
        }
//        System.out.println("Sorted"+charArray);

        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i + 1] == charArray[i]) {
                result += charArray[i + 1];
                result += charArray[i];
                i += 1;
            }
        }
        return String.valueOf(result);
    }


    public static void main(String[] args) {
        //all commented to send my custom string

//        Scanner sc = new Scanner (System.in);
//
//        //INPUT [uncomment & modify if required]
//        String S = sc.next();
//
//        sc.close ();

        //OUTPUT [uncomment & modify if required]
        System.out.print(rearrangeLetters("abzcabcgfekezsaxz"));

        //sample output
        //aabbccee
    }
}
