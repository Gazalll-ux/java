public class inheritance2 {
    public static void main(String[] args) {
    Monitor mon=new Monitor();
    mon.displayname();
     mon.displayclass();
     mon.checkDiscipline(); 
    }
    
}
class Person{
    void displayname(){
System.out.println("Gazalll");
    }

}
class Student extends Person{
    void displayclass(){
        System.out.println("W2");
    }
}
class Monitor extends Student{
    void checkDiscipline(){
    System.out.println("Monitor is checking discipline");
    }
}



