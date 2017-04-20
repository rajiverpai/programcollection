package com.testing.learn;

/**
 * Created by rajive.pai on 4/5/2017.
 */
public class LargestRepeatedString {


    public static char largestRepeatedChar(String s){

        char theChar = '*';
        char prev = '-';
        int count = 0;
        int max = 0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i) == prev){
                count ++;
            }
            else{
                if(count > max){
                    theChar = s.charAt(i-1);
                    max = count;
                    count =0;
                }
            }
            prev = s.charAt(i);
        }
        if(max > 1)
            return theChar;
        else
            return '*';

    }

    public static void main(String s[]){
        String st = "asdddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeasddddddddddddsssfffffffffssdssss";
        System.out.printf("Largest Repeating character is %c", largestRepeatedChar(st));
    }
}
