public class findonemissingnum {
    void missingnum(){
        int a[] = {1,3,4};
        int sum = 0;
         int n = a.length + 1;
         int numbersum = n*(n+1)/2;
         for (int i = 0; i < a.length; i++) {
            sum += a[i];
         }
         int missingNum = numbersum - sum;
         System.out.println(missingNum);
    }
    public static void main(String[] args) {
        findonemissingnum obj = new findonemissingnum();
        obj.missingnum();
    }
}
