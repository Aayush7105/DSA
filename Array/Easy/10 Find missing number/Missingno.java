import java.util.Scanner;

public class Missingno {
    class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int s = 0;
        for(int i :nums){
            s+=i;
        }
        return sum-s;
    }
}
    public static void main(String[] args) {
    }
}
