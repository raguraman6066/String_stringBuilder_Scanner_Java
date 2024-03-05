public class Demo {
    public static void main(String[] args) throws Exception {
        String first = "Java";
        System.out.println(first);

        String str = new String("JavaScript");
        System.out.println(str);
        System.out.println(str.length());

        String concat = first.concat(str);
        System.out.println(concat);

        String name1 = new String("hello");
        String name3 = "hello";
        String name4 = "hello";
        String name2 = new String("hello");
        // string name="demo"; this always check "demo" word is exits or not
        // ..if exits ..it points to that object
        boolean result1 = name1 == name2;
        boolean result3 = name3 == name4;
        boolean result2 = name1.equals(name2);
        System.out.println("== " + result3);
        System.out.println("equals " + result2);

        System.out.println(name1.charAt(4));
        System.out.println(name2.substring(0, 3));

    }
}
