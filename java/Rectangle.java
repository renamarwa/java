 import java.util.Scanner;
  
   class Rectangle {
       private double length;
       private double breadth;
       public Rectangle(double breadth, double squareSide) {
           this.breadth = breadth;
           this.length = (squareSide * squareSide) / breadth;
       }
      public double getArea() {
          return length * breadth;
      }
      public double getPerimeter() {
          return 2 * (length + breadth);
      }
      public void display() {
          System.out.println("Length of rectangle: " + length);
          System.out.println("Breadth of rectangle: " + breadth);
          System.out.println("Area of rectangle: " + getArea());
          System.out.println("Perimeter of rectangle: " + getPerimeter());
      }
  }
 
  class RMain {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
 
          System.out.print("Enter side of square: ");
          double squareSide = sc.nextDouble();
 
          System.out.print("Enter breadth of rectangle: ");
          double breadth = sc.nextDouble();
 
          Rectangle rect = new Rectangle(breadth, squareSide);
          rect.display();
      }
  }
