 import java.util.Scanner;
  
   class ArmstrongNumber {
       private int number;
       public ArmstrongNumber(int number) {
           this.number = number;
       }
  
       public boolean isArmstrong() {
          int num = number;
          int sum = 0;
 
          while (num != 0) {
              int digit = num % 10;
              sum += digit * digit * digit;
              num = num / 10;
          }
 
          return sum == number;
      }
  }
 
  class AMain {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
 
          System.out.print("Enter a number: ");
          int num = sc.nextInt();
 
          ArmstrongNumber obj = new ArmstrongNumber(num);
 
          if (obj.isArmstrong()) {
              System.out.println("Armstrong number");
          } else {
              System.out.println("Not an Armstrong number");
          }
      }
 }

