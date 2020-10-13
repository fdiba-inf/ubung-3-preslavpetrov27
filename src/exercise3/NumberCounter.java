package exercise3;

import java.util.Scanner;

public class NumberCounter {
  public static void main (String[] args) {
  
  Scanner input = new Scanner(System.in);
  int number = input.nextInt();
  int positiv = 0;
  int negativ= 0;
  int sum = 0;
  int avarage = 0;
  int count=0;
  while ( number != 0){
    if (number>0){
      positiv++;
    }else if( number < 0){
      negativ++;
      }
     count++;
    sum = sum + number;
    count++;
    avarage = (sum + number)/count;
  }
  System.out.println("Positive numbers: "+ positiv);
  System.out.println("Negative numbers: "+ negativ);
  System.out.println("Sum: " + sum);
  System.out.println("Avarage: " + avarage);
  


  }
}