package LevelOne; 
import java.util.Scanner;
class ArrayProgram1{

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] z = new int[10];
    for(int i = 0; i < z.length; i++){
      System.out.println("print the value of the z["+i+"]");
      z[i] = s.nextInt();
    }
    for(int i = 0; i < z.length; i++){
      System.out.println("Print the z["+i+"] is "+z[i]);
    }
  }
  
}