package LevelOne;

import java.util.Scanner;

class ArrayProgram2 {
  /* 
    Take 20 integer inputs from user and print the following:
    number of positive numbers
    number of negative numbers
    number of odd numbers
    number of even numbers
    number of 0s.
  */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] z = new int[20];
    int pos = 0;
    int neg = 0;
    int odd = 0;
    int even = 0;
    int zero = 0;

    for (int i = 0; i < z.length; i++) {
      System.out.println("Enter the value of z[" + i + "]");
      z[i] = s.nextInt();

      if (z[i] > 0) {
        pos++;
      } else if (z[i] < 0) {
        neg++;
      } else {
        zero++;
      }
      if (z[i] % 2 == 0) {
        even++;
      } else {
        odd++;
      }
    }
    System.out.println(
        "Positive : " + pos + " \nNegative : " + neg + " \nZerow : " + zero + " \nOdd : " + odd + "\nEven : " + even);
  }
}