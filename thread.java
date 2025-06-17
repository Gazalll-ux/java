public class thread {
    public static void main(String[]args){
    System.out.println("Thread is running");
    Thread t1=new Thread(()-> {
        System.out.println("Thread 1 is running");
    });
    
Thread t2=new Thread(()->{
        System.out.println("Thread 2 is running");
    
});
t1.start();
t2.start();
    }
}