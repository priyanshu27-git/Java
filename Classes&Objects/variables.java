public class variables {
    int a = 5;//instance variable
    static int b = 10;//static varible
    public static void main(String[] args) {
        int z = 15;//local variable
        variables obj = new variables();
        System.out.println("instance variable = " +obj.a);
        System.out.println("Static variable = " +variables.b);
        System.out.println("Local variable = " +z);
    }
}

