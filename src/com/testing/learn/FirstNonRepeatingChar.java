package com.testing.learn;

/**
 * Created by rajive.pai on 4/5/2017.
 */
public class FirstNonRepeatingChar {

    public static void firstNonRepeating(String a){

        char n = a.charAt(0);
        boolean flag = true;
        for(int i =1; i< a.length() ;i ++){

            for(int j =2; j< a.length();j++){
                if(a.charAt(j) == n){
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }
            if(flag){

                System.out.printf("First Non Repeating Character = %c\n", n);
                return;
            }

            n = a.charAt(i);
        }

            System.out.printf("No Non Repeating character exists in the string %s", a);

    }


    public static void main(String[] args){

        firstNonRepeating("stress");
        firstNonRepeating("oooooooo");
    }

}
