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
    }
}
