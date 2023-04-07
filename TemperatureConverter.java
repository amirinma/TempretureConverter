/**
* @author: Mohammad Amiri
* Unit: 2
* Assignment: Fahrenheit to Celsius 
* Description: This program gets a Fahrenheit degree and convert Celsius. 
**/
class TemperatureConverter{
   public static void main(String[] args){
      //Fahrenheit degree
      // I used double primitive data type becuase a decimal number gets a ssigned to fahrenheit variable
      double fahrenheit = 87.6;
      //Celsius degree
      // I used double primitive data type becuase a decimal number gets a ssigned to celsius variable
      double celsius = ((fahrenheit - 32) * 5/9); 
      
      //printing out
      System.out.println("Fahrenheit Temperature " + fahrenheit);
      System.out.printf("Selsius Temperature " + "%.2f", celsius);
   }
}