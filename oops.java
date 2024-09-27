import java.util.*;
class Shape{
   public  void area(){
    System.out.println("displays area");
   }
}
class Triangle extends Shape{
  public void area(int l,int h){
    System.out.println(1/2*l*h);
  }
}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.1416)*r*r);
    }
}
public class oops {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.area();
        Circle c1 = new Circle();
        c1.area(3);
        

    }
}
