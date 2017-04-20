package com.testing.learn;

/**
 * Created by rajive.pai on 4/5/2017.
 */
public class RemoveChar {

    public static String removeChar(String str, char c){

        String s2 ="";
        for(int i=0;i< str.length();i++){
            if(str.charAt(i) != c)
                s2 += str.charAt(i);
        }
        return s2;
    }

    public static void main(String[] s){

        System.out.printf("The String before removal = %s  String After Removal =%s","abcdefg",removeChar("abcdefg",'b'));
    }
}
