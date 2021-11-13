package LevelOne;

import java.util.Scanner;

class ArrayProgram4{
  /*
    Find largest and smallest elements of an array.
  */

public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  int[] a = new int[10];
  for(int i = 0; i < a.length; i++){
    System.out.println("Enter the value of a["+i+"]");
    a[i] = s.nextInt();
  }
  int largest = 0;
  int smalest = 0;
  for(int i = 0; i < a.length; i++){
    if(a[i]>largest){
      largest = a[i];
    }
    if(a[i]<smalest){
      smalest = a[i];
    }
    
  }
System.out.println("Largest is : "+largest+" \nSmallest is: "+smalest);
}
}