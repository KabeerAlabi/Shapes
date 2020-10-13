public abstract class Shape{
    private String name, color;
    
    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }
    
    public String toString(){
        return name + ": " + color + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
    public abstract double getArea();
    
    public abstract double getPerimeter();
}

