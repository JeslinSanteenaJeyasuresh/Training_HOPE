import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int count = 0;
        int len = input.length();

        // check empty string
        if (input.length() == 0 || input.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < len; i++) {
            if (input.charAt(i) == ' ') {  // ✅ fixed
                count++;
            }
        }

        System.out.println(count + 1);

        sc.close();
    }
}