
import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++)
    {
        for(int x=0;x<n-i-1;x++){
        System.out.print(" ");//space
        }
        for(int y=0;y<2*i+1;y++){
            System.out.print("*");//star
            }
        for(int z=0;z<n-i-1;z++){
                System.out.print(" ");//space
        }
        System.out.println();
    }
    for(int i=n-1; i>=0;i--)
    {

        for(int x=0;x<n-i-1;x++){
        System.out.print(" ");//space
        }
        for(int y=0;y<2*i+1;y++){
            System.out.print("*");//star
            }
        for(int z=0;z<n-i-1;z++){
                System.out.print(" ");//space
        }
        System.out.println();
    }
    }
}
