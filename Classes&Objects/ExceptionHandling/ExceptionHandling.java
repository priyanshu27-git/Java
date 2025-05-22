
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
        int c = a/b;
        System.out.println(c);
        }
        catch(Exception e){
            System.out.println("cannot divide by zero");
        }
        System.out.println("hello");
        System.out.println("hiiii");
    }
}
