import java.util.Scanner;

public class Missingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        int [] ar = new int[n];
        System.out.println("enter elements of array:");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();
        int ans  = missingNumber(ar);
        System.out.println("Missing no. is : "+ans);
    }
      public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int s = 0;
        for(int i :nums){
            s+=i;
        }
        return sum-s;
}
}