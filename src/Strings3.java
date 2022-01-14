// split of a give string
public class Strings3 {
    public static void main(String[] args) {
        String s="abc,def,jkl mno";
        // split is use to divide the string in given specific symble and make the array of it
        String[]parts=s.split(",");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }

    }
}
