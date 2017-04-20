package com.testing.learn;

/**
 * Created by rajive.pai on 4/12/2017.
 */
public class SuperReduce {

    public static String reduce(String str){

        String temp ="";
        int len = str.length();
        int i = 0;
        while(str.length() > 0){

            if(i+1 >= len)
                return str;
            if(str.charAt(i) == str.charAt(i+1)){
                temp = str.substring(0,i) +
                        str.substring(i+2, len);
                str = temp;
                len = str.length();
                i=-1;
            }
            i++;
        }

        return str;


    }


    public static void main(String[] s){
        System.out.printf("The Super Reduced String for aassdbbccddd   is %s", reduce("aassdbbccddd"));
    }
}
