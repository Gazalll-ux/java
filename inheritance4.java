public class inheritance4 {
    public static void main(String[] args) {
    GamingLaptop g=new GamingLaptop();
    g. powerOn();
    g.booot();
    g.startGame();   
    }
}
class Device{
    void powerOn(){
        System.out.println("Device is powered on");
    }
}
class Laptop extends Device{
    void booot(){
        System.out.println("Laptop is booting");
    }
}
class GamingLaptop extends Laptop{
    void startGame(){
        System.out.println("Game is stating");
    }
}