import java.util.Scanner;

// print all the substring of a given string
public class String2 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String s=readme.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <=s.length(); j++) {
                System.out.println(s.substring(i,j));
            }
        }
    }
}
