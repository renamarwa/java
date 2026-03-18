 import java.util.Scanner;
  
   class DigitSum {
       private int number;
  
       public DigitSum(int number) {
           this.number = number;
       }
  
 
      public int calculateSum() {
          int total = 0;
          int num = Math.abs(number);
 
          while (num > 0) {
              int digit = num % 10;
              total += digit;
              num /= 10;
          }
 
          return total;
      }
  }
 
  class DMain {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
 
          System.out.print("Enter a number: ");
          int num = scanner.nextInt();
 
          DigitSum obj = new DigitSum(num);
          System.out.println("Sum of digits: " + obj.calculateSum());
 
          scanner.close();
      }
  }

