public class SubString {
    public static void main(String[] args) {
        subStrings("code");
    }

    private static void subStrings(String str) {
        for (int si = 0; si < str.length(); si++) {
            for (int ei = si + 1; ei <= str.length(); ei++) {
                System.out.println(str.substring(si, ei));
            }
        }
    }
}
