

public class constructors {
    String name = "Priyanshu";
    int age = 20;
    public constructors(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + age);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        constructors obj = new constructors("Ashu",21);
        System.out.println(obj.name + obj.age);
    }
}
