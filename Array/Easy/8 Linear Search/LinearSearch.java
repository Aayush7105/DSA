import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int [] ar = new int[n];
        System.out.println("enter elements of array :"); 
        for(int i=0;i<n;i++){
             ar[i] = sc.nextInt();
        }
        System.out.println("enter target element :");
        int t = sc.nextInt();
        for(int i=0;i<n;i++){
            if(ar[i]==t){
                System.out.println("target is at index "+i);
                break;
            }
            }
        }
    }    
