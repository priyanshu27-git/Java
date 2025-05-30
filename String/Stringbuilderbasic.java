public class Stringbuilderbasic {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder(10);
        str.append("Priyanshu");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());
    }
}
