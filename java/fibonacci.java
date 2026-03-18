 import java.util.Scanner;
  
   class Fibonacci {
       private int limit;
       public Fibonacci(int limit) {
           this.limit = limit;
       }
       public void printSeries() {
           int a = 0, b = 1;
 
          System.out.print("Fibonacci series up to " + limit + ": ");
 
          while (a <= limit) {
              System.out.print(a + " ");
              int next = a + b;
              a = b;
              b = next;
          }
 
          System.out.println();
      }
  }
 
  class FMain {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
 
          System.out.print("Enter the limit: ");
          int limit = sc.nextInt();
 
          Fibonacci fib = new Fibonacci(limit);
          fib.printSeries();
      }
  }

