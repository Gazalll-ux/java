public class Encapsulatoin2 {  
    public static void main(String[] args) {
     Employee obj=new Employee();
      obj.setid(024613456);
      obj.setName("Gazal");
      obj.setSalary(95000);

    }
    
}
class Employee{
    private int id;
    private String name;
    private double salary;

void setid(int id){
    this.id=id;

}
void setName(String name){
    this.name=name;
} 
void setSalary(double salary) {
    this.salary=salary;
}
int getid(){
    return id;
}
int getName(){
    return name;
}
int getSalary(){
    return salary;
}
    
}