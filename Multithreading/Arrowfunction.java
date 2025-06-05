public class Arrowfunction {
    public static void main(String[] args) {
        Thread t1 = new Thread( ()->{
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        });
        Thread t2 = new Thread( ()->{
            System.out.println("hiiii");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        });
        t1.start();
        System.out.println(" Sab Khatam");
        t2.start();
    }
}
