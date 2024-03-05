public class Palindrome {
    public static void main(String[] args) {
        String name = "naman";
        System.out.println("polindrome " + checkPolindrome(name));
        ;
    }

    private static boolean checkPolindrome(String name) {
        int start = 0;
        int end = name.length() - 1;
        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
