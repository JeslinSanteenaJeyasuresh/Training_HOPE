public class pattern5 {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= n; i++) {

            // left side
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // right side (IMPORTANT CHANGE)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}