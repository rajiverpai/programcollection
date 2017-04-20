package com.testing.learn;

/**
 * Created by rajive.pai on 4/12/2017.
 */
public class CanRemoveToFormSameFreq {

    private static int getIndex(char ch){

        return (ch - 'a');
    }


    public static boolean isSame(int[] f){

        int prev = f[0];
        for(int i =1; i< f.length; i++){
            if((f[i] != prev )&& (prev!= 0)){
                return false;
            }
            prev = f[i];
        }
        return true;
    }

    public static boolean canRemoveToMatch(String str){

        int[] freq = new int[26];

        for(int i=0; i< str.length(); i++){

            freq[getIndex(str.charAt(i))]++;
        }

        for(int i=0;i< str.length();i++) {
            char ch = str.charAt(i);
            int index = getIndex(ch);
            int curFreq = 0;
            if (freq[index] > 0) {
                freq[index]--;
                if (isSame(freq))
                    return true;
                freq[index]++;
            }
            freq[index]++;

            if (isSame(freq))
                return true;
        }


        return false;
    }

    public static void main(String[] s){

        System.out.println(canRemoveToMatch("xxyyzzz"));

    }
}



