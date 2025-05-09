public class inheritance{
   public static void main(String[]args){
    Cat obj=new Cat();
    //obj.bark();
    obj.eat();
    //obj.lazy();
    obj.sleep();
    
   }

}
class Animal{
    void eat(){
            System.out.println("eatingggg");
    } 
}

class Dog extends Animal{
    void bark(){
        System.out.println("barkkkkkk");
    }
}
//class Puppy extends Dog{
   // void lazy(){
       // System.out.println("cutiee");
   // }
//}
class Cat extends Animal{
    void sleep(){
        System.out.println("meowww");
    }
}
