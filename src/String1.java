import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
//        String s1 = readme.nextLine();
//        System.out.println(s1.length());
        // char ch=s1.charAt(2);
        // System.out.println(ch);
//        for (int i = 0; i < s1.length() ; i++) {
//            char ch=s1.charAt(i);
//            System.out.println(ch);
//        }


// in string you can not change the value of the character..for example---  s1.charAt(3)=='A' it will not work in case of string
// we can't set the value of char..But we can take the the charater from the string..
        // subString..
        String s="abcd";
        System.out.println(s.substring(3));
        System.out.println(s.substring(2));
    }
}
