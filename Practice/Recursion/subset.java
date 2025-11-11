import java.util.*;

public class subset{
    public static void main(String args[]){
        int[] arr = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        subset(0,arr,res,new ArrayList<>());
        System.out.print(res);

    }
    public static void subset(int index , int[] arr , List<List<Integer>> res , List<Integer> curr){
        if(index == arr.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[index]);
        subset(index+1,arr,res,curr);
        curr.remove(curr.size()-1);
        subset(index+1,arr,res,curr);
    }
}