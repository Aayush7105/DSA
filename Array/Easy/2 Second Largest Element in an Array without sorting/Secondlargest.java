import java.util.Scanner;

public class Secondlargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n = sc.nextInt();
        int [] ar = new int[n];
        System.out.println("Enter elements of array :");
        for(int i = 0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        sc.close();
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i :ar){
            if(i>largest){
               secondlargest = largest; 
               largest = i;
            }
        }
        System.out.println("Secondlargest element = "+secondlargest);

    }
}