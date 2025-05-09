public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setMarks(40); 
        System.out.println(obj.getMarks());
        obj.setName("Yash");
        System.out.println(obj.getName());   }

    }    
    
    

class Student{
     private int marks;
     private String name;

     void setMarks(int marks)
     {
            this.marks = marks;
     }
     void setName(String name)
     {
            this.name = name;
     }
     int getMarks()
     {
        return marks;
     }
     String getName()
     {
        return name;
     }


}
