 import java.util.Scanner;
  
   class NumberReverse {
       private int number;
  
       public NumberReverse(int number) {
           this.number = number;
       }
  
      public int reverseNumber() {
          int num = number;
          int reversed = 0;
 
          while (num != 0) {
              int digit = num % 10;
              reversed = reversed * 10 + digit;
              num = num / 10;
          }
 
          return reversed;
      }
  }
 
  class RMain {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
 
          System.out.print("Enter a number: ");
          int num = sc.nextInt();
 
          NumberReverse obj = new NumberReverse(num);
          int result = obj.reverseNumber();
 
          System.out.println("Reversed number is: " + result);
      }
  }
 
