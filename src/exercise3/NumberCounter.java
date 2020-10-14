package exercise3;

import java.util.Scanner;

public class NumberCounter {
  public static void main (String[] args) {
  
  Scanner input = new Scanner(System.in);


  int positiv = 0;

  int negativ= 0;

  double sum = 0.0;

  double avarage = 0.0;

  int count=0;
  
 int number = input.nextInt();

  while ( number != 0) {
    
    if (number > 0){
      positiv++;
    }else{
      negativ++;
      }

    count++;
    sum = sum + number;
    
    number=input.nextInt();
  
   
  }

  avarage = (sum)/count;

  System.out.println("Positive numbers: "+ positiv);
  System.out.println("Negative numbers: "+ negativ);
  System.out.println("Sum: " + sum);
  System.out.println("Avarage: " + avarage);
  


  }
}