// java program to practising the uses of comparison operators
// author: naimul hassan niloy
// date: 8/15/22

import java.util.Scanner;

public class ComparisionOperators {
    public static void main(String[] args) {
        // declarations
        int fixedNum = 10, enteredNum;

        // create an objects for Scanner class
        Scanner sc = new Scanner(System.in);

        // user input from keyboard
        System.out.println("Enter a number");
        enteredNum = sc.nextInt();

        // comparison
        if(fixedNum > enteredNum) {
            System.out.println("The given number is greater");
        }
        else {
            System.out.println("The entered number is greater");
        }

    }
}
