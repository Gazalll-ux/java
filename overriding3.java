public class overriding3 {
    public static void main(String[] args) {
     Shape obj =new Circle();
    // Shape obj =new Square();
     obj.draw();
     obj.draw();
    }
}
class Shape{
    void draw(){
        System.out.println("diagram of different shapes ");

    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("A circle have no dimensions");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("In sqare all sides are equal");
        super.draw();
    }
} 
