public class inheritance3 {
    public static void main(String[] args){
Circle c=new Circle();
c.draw();
c.calculateArea();
    }
}
class Shape{
    void draw(){
    System.out.println("Drawing a shape");
}
}
class Circle extends Shape{
    void calculateArea(){
    System.out.println("Area of circle= r r");
}
}
