package exercise3;


public class NumberSearch {
  public static void main(String[] args){
    int count=0;
 for(int index=100;index<=1000;index++){
   
 
   if (index%5==0 && index%6==0){
     count++;
       System.out.print(index +" ");
     }
     if (count==10){
     count=0;
       System.out.println();
   }
     
   }
   }
 }
  
