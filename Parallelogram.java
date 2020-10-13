public class Parallelogram extends Shape{
  private double a, b, h;

  public Parallelogram(String name, String color, double a, double b, double h){
    super(name, color);
    this.a = a;
    this.b = b;
    this.h = h;
  }
  public double getArea(){
    double area = b * h;
    return area;
  }
  
  public double getPerimeter(){
    double perimeter = (2*a) + (2*b);
    return perimeter;
  }
}
