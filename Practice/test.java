import java.util.*;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(cipher(s,k));
    }
    public static String cipher (String s, int k){
        StringBuilder  result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int index = (i + k) % s.length();
            result.append(Character.toLowerCase(s.charAt(index)));
        }
        return result.toString();
    }

}