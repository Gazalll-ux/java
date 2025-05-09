public class overriding {
    public static void main(String[] args) {
      Vehicle obj=  new bike();
      obj.run();
    }

    
}
class Vehicle{
    void run (){
    System.out.println("petrol is used to run vehicle");
    }
}
    class bike extends Vehicle{
        void run(){
            System.out.println("bike is a two passenger seat");
            super.run();
        }

        }
