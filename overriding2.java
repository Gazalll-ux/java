public class overriding2{
    public static void main(String[] args) {
    Animal obj =new Dog();  
    obj.sound ();
    }
}
class Animal{
    void sound(){
    System.out.println("sound of dog");
}
}
class Dog extends Animal {
    void sound(){
        System.out.println("barkkkk");
        super.sound();
    }
}




    
