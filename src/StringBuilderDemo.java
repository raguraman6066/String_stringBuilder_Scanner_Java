public class StringBuilderDemo {
    public static void main(String[] args) {
        // string builder...mutable squence of char
        String str = "hello";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(str);
        System.out.println(sb2.length());
        sb2.append(" abc");
        System.out.println(sb2);

        sb.insert(0, "a");
        System.out.println(sb);
        String modifiedStr = sb2.toString();
        System.out.println(modifiedStr);

    }
}
