import java.util.*;
public class nextgreater{
    public static void main(String args[]){
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(NextGreater(nums1,nums2));

     }
     public static int[] NextGreater(int[] nums1, int[] nums2){
            Stack<Integer> stack = new Stack<>();
            int [] ans = {0,0}; 
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for(int i:stack){
            System.out.println(i);
        }
        System.out.println(stack);
        System.out.println(map);
        return ans;
     }
}