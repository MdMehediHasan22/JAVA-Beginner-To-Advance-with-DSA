public abstract class Shape {
   double dim1,dim2;
   Shape(double dim1,double dim2){
      this.dim1=dim1;
      this.dim2=dim2;
   }
   abstract void Area();

   static class Rectangle extends Shape{
    Rectangle(double dim1,double dim2){
        super(dim1, dim2);
    }
    void Area(){
        double area = dim1*dim2;
        System.out.println(area);
    }
   }
   static class Triangle extends Shape{
    Triangle(double dim1,double dim2){
        super(dim1, dim2);
    }
    void Area(){
        double area = 0.5*dim1*dim2;
        System.out.println(area);
    }
   }
   static class Circle extends Shape{
    Circle(double r){
        super(r, r);
    }
    void Area(){
        double area = 3.1416*dim1*dim2;
        System.out.println(area);
    }
   }

   public static void main(String[] args) {
    Shape shape;
    shape = new Rectangle(3, 4);
    shape.Area();
    shape = new Triangle(3, 5);
    shape.Area();
    shape =new Circle(5);
    shape.Area();
   }
}
