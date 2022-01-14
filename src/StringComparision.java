// String comparession LeetCode
import java.util.Scanner;
public class StringComparision {
    public static String comparession1(String str) {
        String s = str.charAt(0) + "";
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr != prev) {
                s += curr;
            }
        }
        return s;
    }
    public static String comparession2(String str) {
        String s = str.charAt(0) + "";
        int c = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if (curr == prev) {
                c++;
            } else {
                if (c > 1) {
                    s += c;
                    c = 1;
                }
                s += curr;
            }
        }

            if (c > 1) {
                s += c;
                c = 1;
            }

            return s;
        }
        public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        System.out.println(comparession1(str));
        System.out.println(comparession2(str));
    }
}
