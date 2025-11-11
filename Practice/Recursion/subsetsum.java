import java.util.*;

public class subsetsum{
    public static void main(String args[]){
        int[] arr = {1,2,3};
        List <Integer> res = new ArrayList<>();
        subset(0,arr,res,0);
        System.out.print(res);

    }
    public static void subset(int index , int[] arr ,List<Integer> res , int currsum){
        if(index == arr.length){
            res.add(currsum);
            return;
        }
        subset(index+1,arr,res,currsum+arr[index]);
        subset(index+1,arr,res,currsum);
    }
}