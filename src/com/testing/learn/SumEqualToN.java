package com.testing.learn;

/**
 * Created by rajive.pai on 4/5/2017.
 */
public class SumEqualToN {

    public static void sumEqualToN(int[] a, int[] b, int n){

        for(int i=0; i<a.length;i++){
            for(int j=0;j< b.length; j++){
                if(a[i] + b[j] == n)
                    System.out.printf("(%d,%d)\n", a[i],b[j]);
            }
        }

    }

    public static void main(String[] s){

        int[] a = {1,2,4,-6,5,7,9};
        int[] b = {3,6,3,4,0};

        sumEqualToN(a,b,5);
    }

}
