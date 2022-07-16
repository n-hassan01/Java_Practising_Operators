// java program to practising the uses of operators (increment & decrement)
// author: naimul hassan niloy
// date: 8/15/22

public class IncrementDecrement {
    public static void main(String[] args) {
        // declarations
        int a = 5, increment1, increment2, decrement1, decrement2;

        // operations
        increment1 = a++; // first value of a will be assigned then increment the value of a; that means now increment=5 and a=6;
        // System.out.println(a); // a = 6;
        increment2 = ++a; // currently a=6; first the value will be incremented then assigned to increment2(=7) and a(=7);
        decrement1 = a--; // currently a=7; first 7 will be assigned to decrement1(=7) and then decrease the value of a; so a=6;
        // System.out.println(a); // a=6;
        decrement2 = --a; // currently a=6; first decrease the value of a and then assigned to decrement2(=5) and a(=5); so a=5;
        // System.out.println(a); // a=5;

        // display results
        System.out.println(increment1); // increment1 = 5;
        System.out.println(increment2); // increment2 = 7;
        System.out.println(decrement1); // decrement1 = 7;
        System.out.println(decrement2); // decrement2 = 5
        System.out.println(a); // finally a = 5;
    }
}
