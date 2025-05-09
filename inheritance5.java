public class inheritance5 {
    public static void main (String[]args){
Novel n=new Novel();
n.read();
n.storyline();
    }
}
class Book{
    void read(){
        System.out.println("reading a book");
    }
}
class Novel extends Book{
    void storyline(){
        System.out.println("the novel has an interesting storyline");
    }
}
