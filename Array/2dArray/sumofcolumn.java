public class sumofcolumn {
    public static void main(String[] args) {
        int [][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}};
        for (int j = 0; j < a.length; j++) {
            int colsum=0;
            for (int i = 0; i < a[j].length; i++) {
                colsum += a[i][j];
            }
            System.out.println("Sum of col " + j + " = " +colsum);
        }
    }
}
