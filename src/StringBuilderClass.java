public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");// StringBuilder is mutable
        System.out.println(sb);
        char ch=sb.charAt(0);//get
        System.out.println(ch);
        sb.setCharAt(0,'d');//update
        // by using StringBuilder we can chanhe the instance of the StringBuilder...
        // but in case of the String we can't change the instance of the String..
        System.out.println(sb);
        sb.insert(2,'y');//insert
        System.out.println(sb);
        sb.deleteCharAt(2);//remove the perticular character
        System.out.println(sb);
        // if you want to add the character at the end of the String we can use here "append"
        sb.append('g');
        System.out.println(sb);
        System.out.println(sb.length());//length
        // By using String
        int n=10000;
        String s="";
        long start=System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            s+=i;
        }
        long end=System.currentTimeMillis();
        long duration=end-start;
        System.out.println(duration);
        // by using StringBuilder
        long start1=System.currentTimeMillis();
        StringBuilder sb1=new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }

        long end1=System.currentTimeMillis();
      long duration1=end1-start1;
       System.out.println(duration1);
    }
}
