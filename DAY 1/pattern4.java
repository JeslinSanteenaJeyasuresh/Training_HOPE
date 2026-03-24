public class pattern4 {
    public static void main(String[] args) {
        int n = 5;

        // Upper part
        for (int i = 1; i <= n; i++) {

            // increasing left shift (this is the key!)
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {

            // continue same shift pattern
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}