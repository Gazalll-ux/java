public class inheritance1{
    public static void main(String[] args) {
    Manager obj=new Manager();
     obj.work();
     obj.meeting();
    }
}
class Employee{
    void work(){
        System.out.println("start programming");
    } 
}
class Manager extends Employee{
    void meeting (){
        System.out.println("start program one");
    }
}