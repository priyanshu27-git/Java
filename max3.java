import java.util.Scanner;
public class max3 {
    public static void main(String[] args)throws Exception {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a>b && a>c){
            System.out.println(+a);
        }
        else if(b>a && b>c){
            System.out.println(+b);
        }
        else {
            System.out.println(+c);
        }
    }
}
