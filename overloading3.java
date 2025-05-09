public class overloading3{
    public static void main(String[] args) {
     Student obj=new Student(12);
     obj.print();   
    }
    
}
class Student{
          int age;
    Student(int age){
    this.age=age;

}
void print(){
    System.out.println("JAI HIND ");
}
}

