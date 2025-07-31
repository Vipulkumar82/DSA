public class Triangle {
    public static void main(String[] args) {
        int n = 5;
        // for (int i = 0; i < n; i++) {
        //     // Space
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print("  ");
        //     }

        //     // Stars
        //     for (int j = 0; j < 2 * i + 1; j++) {
        //         System.out.print("X ");
        //     }
        //     // Space
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print("  ");
        //     }
        //     System.out.println();
        // }

//         X
//       X X X
//     X X X X X
//   X X X X X X X
// X X X X X X X X X


        for (int i = n; i >= 0 ; i--) {
            // Space
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("  ");
            }
            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("X ");
            }
            // Space
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
// X X X X X X X X X X X 
//   X X X X X X X X X
//     X X X X X X X
//       X X X X X
//         X X X
//           X
    }
}
