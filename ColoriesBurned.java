/**
* @author: Mohammad Amiri
* Unit: 2
* Assignment: colories burned 
* Description: This program calculates the total number of colories burned by runing, playing basketball and sleeping in 30 minutes interval. 
**/
class ColoriesBurned{
   public static final int RunningMets = 10;
   public static final int BasketballMets = 8;
   public static final int SleepingMets = 1;
   public static final double KilogramsToPound = 2.2;
   public static void main(String[] args){
      double weight = 150; 
      double time = 30;
      // colories burned by running
      double colories_burned_running = 0.0175 * RunningMets * (weight / KilogramsToPound) * time;
      //colories burned by basketball
      double colories_burned_basketball = 0.0175 * BasketballMets * (weight / KilogramsToPound) * time;
      //colories burned by sleeping
      double colories_burned_sleeping = 0.0175 * SleepingMets * (weight / KilogramsToPound) * time;
      //total colories burned
      double total_colories_burned = colories_burned_running + colories_burned_basketball + colories_burned_sleeping;
      
      //print out the total colories burned ou
      System.out.printf("Total colories burned out is: " + "%.2f", total_colories_burned);
      
   }
}