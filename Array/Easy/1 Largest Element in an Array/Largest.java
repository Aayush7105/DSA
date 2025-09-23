import java.util.*;

public class Largest{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in); 
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int [] ar = new int[n]; 
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();
        int max = Integer.MIN_VALUE;
        for(int i: ar){
            max = Math.max(max,i);
        }
        System.out.println("Maximum element = " + max);
    }
}