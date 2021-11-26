package exercise5;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) 
        {
            numbers[index] = input.nextInt();
        }

        System.out.print("Search for number: ");
        int number = input.nextInt();

        // Search for number in numbers
        int numberIndex = -1;
        for (int count = 0; count < numbers.length; count++) 
        {
          if (number == numbers[count]) 
          {
            numberIndex = count;
          }
        }
        System.out.println("Number index: " + numberIndex);
      }
}


        
    

