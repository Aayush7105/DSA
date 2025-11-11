import java.util.Scanner;

public class Findnoappearance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        System.out.println("enter values of array : ");
        int [] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("appearance one : "+Find(ar));
    }
    public static int Find(int[] ar){
        int x = 0;
        for(int i:ar){
            x = x^i;
        }
        return x;
    }
}
