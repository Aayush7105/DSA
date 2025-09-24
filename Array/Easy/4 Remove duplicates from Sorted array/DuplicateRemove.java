import java.util.Scanner;

public class DuplicateRemove{
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
        int i = 0;
        for(int j=0;j<n;j++){
            if(ar[j] != ar[i]){
                ar[i+1] = ar[j];
                i++;
            }
        }
        System.out.println("Non Duplicate elements are : "+(i+1));
    }
}