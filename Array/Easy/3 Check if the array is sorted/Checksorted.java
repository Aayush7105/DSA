import java.util.Scanner;

public class Checksorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int [] ar = new int[n];
        System.out.println("Enter elements of array :");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(isSorted(ar,n));
    }
    public static boolean isSorted(int[] ar,int n){
        for(int i=1;i<n;i++){
            if(ar[i]<ar[i-1]){
                return false;
            }
        }
        return true;
    }
}