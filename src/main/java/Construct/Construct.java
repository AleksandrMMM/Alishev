package Construct;

import java.util.Arrays;

class Solution {


    public static int min(int a, int b) {
        int min;
        if (a > b) {
            min = b;
        } else {
            min = a;
        }

        return min;
    }
    public static int min(int a, int b, int c, int d) {
        int[] nums = {a, b, c, d};
        for(int i = 0; i < nums.length + 1; i++){
            if(nums[i] > nums[i++]){
                nums[i] = nums[i++];

            }else {

            }
        }
        return a;
    }

        public static void main(String[] args){
            System.out.println(min(-20, -10));
            System.out.println(min(-40, -10, -30, 40));
            System.out.println(min(-20, -40, -30, 40));
            System.out.println(min(-20, -10, -40, 40));
            System.out.println(min(-20, -10, -30, -40));
        }


}