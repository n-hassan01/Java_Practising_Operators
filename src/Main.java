// java program to practising the uses of operators
// author: naimul hassan niloy
// date: 8/15/22

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // declarations
        double a, b, c, d, u, v, x, y;
        double result1, result2, result3, result4;

        // create an object for Scanner class
        Scanner sc = new Scanner(System.in);

        // user input from keyboard
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        u = sc.nextInt();
        v = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();

        // expressions
        result1 = (x-y)/2;
        result2 = ((b*b) - (4*a*c))/(2*a);
        result3 = (v*v) - (u*u);
        result4 = a*b - d;

        // display results
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }
}