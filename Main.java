class Main {
  public static void main(String[] args) {
    Parallelogram test = new Parallelogram("test", "blue", 3,6,2);
    //getArea() and getPerimeter() are both called in the toString() method
    System.out.println(test);
  }
}