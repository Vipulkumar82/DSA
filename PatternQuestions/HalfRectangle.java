public class HalfRectangle {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;
        for(int i = 0; i <= row; i++){
            for(int j = 0; j <= col-i; j++){
                System.out.print("   ");
            }
            for(int k = 0; k<=i; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
