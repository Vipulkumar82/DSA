public class HalfReverseRectangle {
    public static void main(String[] args) {
        int row = 6;
        int col = 6;

        for(int i = 0; i <= col;i++){
            for(int k = 0; k<=i; k++){
                System.out.print(" ");
            };
            for(int j=0; j <=col-i; j++){
                System.out.print("*");
            };
            System.out.println();
        }
//  *******
//   ******
//    *****
//     ****
//      ***
//       **
//        *

        // int n= 4; 
        // for (int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(i+ " ");
        //     }
        //     System.out.println();
        // }

// 1 
// 2 2
// 3 3 3
// 4 4 4 4

        // int n=5;
        // for(int i = 1; i<=n; i++){
        //     for (int j = 1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

    }
}
