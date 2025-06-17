public class thread3 {
    public static void main(String[]args){
        System.out.println("Main Thread Started");}
    }

     public class SimpleWaitNotify {Add commentMore actions

    private boolean isSignalled = false;

    public synchronized void sendSignal() {
        isSignalled = true;
        System.out.println("Producer: Sending signal...");
        notify();
    }

    public synchronized void waitForSignal() {
        while (!isSignalled) {
            try {
                System.out.println("Consumer: Waiting for signal...");
                wait();
            } catch (InterruptedException e){

            }  
    }
}
{
System.out.println("Consumer: Got the signal! Proceeding...");
    }

    public static void main(String[] args) {
        SimpleWaitNotify obj = new SimpleWaitNotify();

        Thread consumer = new Thread(() -> {
            obj.waitForSignal();
        });

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            obj.sendSignal();
        });
          Add commentMore actions

        consumer.start();
        producer.start();
    }
}
     