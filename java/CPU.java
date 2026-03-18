 import java.util.*;
  
   class CPU {
       private int price;
       private int ram;
       private Processor processor;
       public CPU(int price, int ram, int cores, String manufacturer) {
           this.price = price;
           this.ram = ram;
          this.processor = new Processor(cores, manufacturer);
      }
      public int getPrice() {
          return price;
      }
 
      public int getRam() {
          return ram;
      }
 
      public Processor getProcessor() {
          return processor;
      }
      public class Processor {
          private int noOfCores;
          private String manufacturer;
          public Processor(int noOfCores, String manufacturer) {
              this.noOfCores = noOfCores;
              this.manufacturer = manufacturer;
          }
          public int getNoOfCores() {
              return noOfCores;
          }
 
          public String getManufacturer() {
              return manufacturer;
          }
      }
 
      public void displayInfo() {
          System.out.println("CPU Price: $" + getPrice());
          System.out.println("CPU RAM: " + getRam() + " GB");
          System.out.println("Processor Cores: " + processor.getNoOfCores());
          System.out.println("Processor Manufacturer: " + processor.getManufacturer());
      }
 
      public static void main(String[] args) {
          CPU myCPU = new CPU(300, 16, 8, "Intel");
          myCPU.displayInfo();
      }
  }
