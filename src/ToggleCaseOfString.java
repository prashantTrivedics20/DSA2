import java.util.Scanner;
// Toggle case
public class ToggleCaseOfString {
    public static String toggleCase(String str)
    {
      StringBuilder sb=new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch=sb.charAt(i);
            char uch;
            char lch;
            if(ch>='a'&&ch<='z')
            {
                uch=(char)('A'+ch-'a');
                sb.setCharAt(i,uch);
            }
            else if(ch>='A'&&ch<='Z')
            {    lch=(char)(ch+32);
                sb.setCharAt(i,lch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        System.out.println(toggleCase(str));
    }

}
