// String with Difference of every Two consecutive Character
import java.util.Scanner;
public class DifferenceOfCharacter {
    public static String solution(String s)
    {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i <s.length() ; i++) {
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            int gap=curr-prev;
            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.next();
        System.out.println(solution(str));
    }
}
