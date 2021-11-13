package LevelOne;
import java.util.Scanner;
class ArrayProgram3{
  /*
    Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
  */
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int[] a = new int[10];
    int[] b = new int[10];
    for(int i = 0; i < a.length; i++){
      System.out.println("Enter the value off a["+i+"]");
      a[i] = s.nextInt();
    }
    int j = 0;
    for(int i = b.length-1; i>= 0; i-- ){
      b[i] = a[j];
      j++;
    }
    for(int i = 0; i < b.length; i++){
      System.out.println("The value of b["+i+"] is "+b[i]);
    }
  }
}