/*
File Name: main.java
Name: Amar Panjwani
Description: This programs receives 4 inputted numbers from the user and determines whether or not there are two matching pairs. 
Date: 03/08/21
Email: panjwania@student.vvc.edu
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int count = 0;

    System.out.print("Please enter 4 integers, separated by spaces (ex. 3 9 6 3): ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();
    int num4 = in.nextInt();


    if (num1 == num2 || num1 == num3 || num1 == num4)
    {
      count++;
    }

    if (num2 == num3 || num2 == num4)
    {
      count++;
    }

    if (num3 == num4)
    {
      count++;
    }

    if (count >= 2)
    {
      System.out.println("two pairs");
    }
    else
    {
      System.out.println("not two pairs");
    }
  }
}