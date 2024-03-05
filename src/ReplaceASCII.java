public class ReplaceASCII {
    public static void main(String[] args) {
        System.out.println(replaceASCII("cdHEl"));

    }

    private static String replaceASCII(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (i % 2 == 0) {
                // even
                ch = (char) (ch + 1);
                sb.setCharAt(i, ch);
            } else {
                // odd
                ch = (char) (ch - 1);
                sb.setCharAt(i, ch);
            }

        }
        return sb.toString();
    }
}
