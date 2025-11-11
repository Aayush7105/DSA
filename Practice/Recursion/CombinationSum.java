import java.util.*;
public class CombinationSum{
    public static void main(String args[]){
        int[] arr = {2,3,6,7};
        int target = 7;
        List<List<Integer>> res = new ArrayList<>();
        combsum(0,arr,res,0,target,new ArrayList<>());
        System.out.print(res);
    }
   public static void combsum(int index, int[] arr, List<List<Integer>> res, int total, int target, List<Integer> curr) {
    if (total==target) {
        res.add(new ArrayList<>(curr));
        return;
    } 
    if (total > target || index>=arr.length) {
        return;
    }
    curr.add(arr[index]);
    combsum(index, arr, res, total + arr[index], target, curr);
    curr.remove(curr.size() - 1);
    combsum(index + 1, arr, res, total, target, curr); 
}}
      
      