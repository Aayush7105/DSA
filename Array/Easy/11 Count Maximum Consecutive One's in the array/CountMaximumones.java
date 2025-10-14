import java.util.Scanner;

public class CountMaximumones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int ar [] = new int[n];
        System.out.println("enter elements of array : ");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("maximum consecutive zeroes are : "+MaximumZeroes(ar));

    }
    public static int MaximumZeroes(int ar[]){
        int cnt = 0;
        int maxi = 0;
        for(int i=0;i<ar.length;i++){
            if(ar[i] == 0){
                cnt++;
            }
            else{
                cnt=0;
            }
            maxi = Math.max(cnt,maxi);
        }
        return maxi;
    }

    
}
