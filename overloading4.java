public class overloading4 {
    public static void main(String[] args) {
    Area obj =new Area();
      obj.area(5);
      obj.area(8,5);  
    }
    
}
class Area {
    void area(double radius){
        System.out.println("area of circle:"+(Math.PI* radius *radius ));
    }

    void area(double length ,double width){
        System.out.println("area of retangle:"+(length* width));
    }
}

