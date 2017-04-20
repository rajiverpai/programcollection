package com.testing.learn;

import java.util.Arrays;

/**
 * Created by rajive.pai on 4/11/2017.
 */
public class FirstReverse {

    public static String reverse(String st){
        char[] str = st.toCharArray();
        StringBuilder s = new StringBuilder();
        if(st.length() == 0)
            return "";
        char temp;
        for(int i=0, j = st.length()-1; i<=st.length()/2; i++, j--){

            temp = str[i];
            str[i] = str[j];
            str[j] = temp;

        }
        s.append(str);
        return s.toString();

    }

    public static void main(String[] s){

        System.out.printf("Reverse of  coderbyte is %s",reverse("coderbyte"));
        System.out.printf("Reverse of  I Love Code is %s",reverse("I Love Code"));
    }




}
