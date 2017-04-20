package com.testing.learn;

/**
 * Created by rajive.pai on 4/12/2017.
 */
public class Multiples {

    public static void isMultiple(int n, int mul){

        int cur_mul = mul;
        for(int i=0; i<= n; i++){

            if(i == cur_mul){
                cur_mul += mul;
                if(i == n){
                    System.out.printf("%d is a multiple of %d\n",i, mul);
                    return;
                }

            }

        }
        System.out.printf("%d is not a multiple of %d\n",n,mul);


    }



    public static void main(String[] args){
        isMultiple(78515,3);
        isMultiple(2235553,2);
    }
}
