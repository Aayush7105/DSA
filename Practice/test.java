import java.util.*;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));

    }

    public static String reverse(String s) {

        String x = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            x += s.charAt(i);

        }
        return x;
    }

}