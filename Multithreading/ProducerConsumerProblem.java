class SimpleWaitModify{
    static boolean issignalled = false;
    public synchronized void sendSignal() {
        issignalled = true;
        System.out.println("Consumer : Waiting for signal");
        notify();
    }
}
public class ProducerConsumerProblem{
    public static void main(String[] args) {
        SimpleWaitModify obj = new SimpleWaitModify();
        
        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(1000);
                obj.sendSignal();
                System.out.println("Producer : Signal sent");
            } catch (InterruptedException e) {
            }
        });
        
        Thread consumer = new Thread(() -> {
            synchronized (obj) {
                while (!SimpleWaitModify.issignalled) {
                    try {
                        System.out.println("Consumer : Waiting for signal");
                        obj.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Consumer : Interrupted while waiting");
                    }
                }
                System.out.println("Consumer : Signal received, proceeding with work.");
            }
        });
        
        consumer.start();
        producer.start();
    }
}
