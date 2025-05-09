public class overloading2 {
    public static void main(String[] args) {
     Parent obj=new Parent();
     obj.sum(35);
     obj.sum(35,42);
     obj.sum(35,42,55);

    }
}
class Parent {
    void sum (int a){
      System.out.println(a);  
    }
void sum (int a,int b){
System.out.println(a+b);
}
void sum (int a,int b,int c);{
System.out.println(a+b+c);
}
}