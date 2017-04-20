package com.testing.learn;

/**
 * Created by rajive.pai on 4/5/2017.
 */
public class LargestAndSecondLargest {


    public static void findLarSecLar(int[] arr){

        int max1 = arr[0];
        int max2 = arr[0];
        for(int i =1; i< arr.length; i++){

            if(arr[i] > max1){
                max1 = arr[i];
            }
            if(arr[i] > max2 && arr[i] < max1){
                max2= arr[i];
            }

        }

        System.out.printf("Largest =%s, SecondLargest =%s",max1, max2);

    }


    public static void main(String[] args){
        int[] arr = {0,100,3,6,5,5,2,4};
        findLarSecLar(arr);

    }
}
