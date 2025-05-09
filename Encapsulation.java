class Atm{ 
   private int a;
   void setRupees(int a){
    this.a=a;

   }
int getRupees(){


return a;


}}

class Encapsultion{


 public static void main(String[]args){
 Atm obj=new Atm();
 obj.setRupees(4002);
 System.out.println(obj.getRupees());

 }

}
