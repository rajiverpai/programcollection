package com.testing.learn;

/**
 * Created by rajive.pai on 4/20/2017.
 A Dyck word is a sequence of +1’s and -1’s with the property
 that the sum of any prefix of the sequence is never negative. For example,
 +1,−1,+1,−1 is a Dyck word, but +1,−1,−1,+1 is not a Dyck word since
 the prefix +1 − 1 − 1 < 0. Describe any relationship between Dyck words
 and Stack push(x) and pop() operations.
 */
public class DyckWord {


    private static boolean isDyckWord(String s){

        int sum =0;
        String[] nums = s.split(",");
        for(int i=0; i< nums.length;i++){
            sum += Integer.parseInt(nums[i]);
            if(sum < 0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args){

        System.out.println(isDyckWord("+1,-1,+1,-1"));
        System.out.println(isDyckWord("+1,-1,-1,+1"));


    }
}
