import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int [] ar  = new int[n];
        System.out.println("Enter elements of array :");
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();
        int temp = ar[0];
        for(int i=0;i<n-1;i++){
            ar[i] = ar[i+1];
        }
        ar[n-1] = temp;
        for (int i = 0; i < n; i++) {
        System.out.print(ar[i]+" ");
  }
    }
}
