public class overloading {
    public static void main(String[] args){
Parent obj=new Parent();
obj.sum(340);
obj.sum(340,40);
obj.sum(340,40,50);
    }
    
}
class Parent{
    void sum(int a){
        System.out.println("my name is gazal"+a );
    }

void sum(int a,int b){
    System.out.println(a+b);
}
void sum(int a,int b,int c){
    System.out.println(a+b+c);
}
}