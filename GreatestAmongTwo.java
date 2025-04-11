import java.util.Scanner;
public class GreatestAmongTwo {
    public static void main(String[] args)throws Exception {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a>b){
            System.out.println("The Greatest number is " +a);
        }
        else if(a<b){
            System.out.println("The Greatest number is " +b);
        }
        else {
            System.out.println("Both Numbers are equal");
        }
    }
}
