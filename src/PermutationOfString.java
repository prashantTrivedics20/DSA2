import java.util.Scanner;
// print all the permutation of an string(iterative solution)
public class PermutationOfString {
    public static void solution(String str)
    {
        int n=str.length();
        int f=factorial(n);
        for (int i = 0; i <f ; i++) {
            StringBuilder sb=new StringBuilder(str);
            int temp=i;
            for (int div=n;div>=1; div--) {
                int q=temp/div;
                int r=temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp=q;
            }
            System.out.println();

        }

    }
    public static int factorial(int n)
    {
        int val=1;
        for (int i = 1; i <=n; i++) {
            val=val*i;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.next();
        solution(str);

    }
}
