public class minimumnumber {
    public static void main(String[] args) {
        int a [][] = {
            {11,2,3},
            {4,5,6},
            {7,8,9}
        };
        int min = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] < min){
                    min = a[i][j];
                }
            }
        }
        System.out.println("Minimum element is " + min);
    }
}
