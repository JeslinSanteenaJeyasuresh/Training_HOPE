public class Shift_string {
    public static void main(String[] args) {
        String s = "abcd";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s);
            s = s.substring(1) + s.charAt(0);// shift the first character to the end of the string
        }
    }
}