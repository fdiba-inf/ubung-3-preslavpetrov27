package exercise3;

import java.util.Scanner;

 class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      double a= input.nextDouble();
      double b= input.nextDouble();
      double c = input.nextDouble();
      do{
        if (a>0 && b>0 && c>0 && a>c+b && b>a+c && c> b+a){
          double s = (a + b + c)/2;
          double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
          System.out.println("Area: "+area);
        if(a!=b && b!=c && c!=a){
         String typ1 = "scalene";
          System.out.printl("Triangle: " + typ1);

        }else if (a==b || b==c || c=a ){
          String typ2="isosceles";
          System.out.println("Triangle: " + typ2);
        (a==b && b==c)
      } 
        
      }
        
    }