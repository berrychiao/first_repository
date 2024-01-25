/*
import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public void moveZeroes(int[] nums) {
        int b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[b];
                nums[b++] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
public class App {

    public static void main(String[] args){
        new Solution().moveZeroes(new int[]{0,1,0,3,12});
    }
}*/
