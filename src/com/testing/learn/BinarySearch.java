package com.testing.learn;

/**
 * Created by rajive.pai on 4/5/2017.
 */
public class BinarySearch {

    public static boolean binarySearch(int n, int[] a){

        int i =0;
        int j = a.length;
        int mid =0;
        while(i<= j){
            mid = (i + j)/2;
            if(a[mid] == n)
            {   System.out.println("Element Found");
                return true;
            }
            else
                if(n > a[mid])
                    i = mid + 1;
                else
                    j = mid-1;

        }
        System.out.printf("Element Doesnt Exist\n");
        return false;


    }

    public static void main(String[] s){

        int[] a= {1,4,7,12,34,67,87,123,667};
        binarySearch(17,a);
    }
}
