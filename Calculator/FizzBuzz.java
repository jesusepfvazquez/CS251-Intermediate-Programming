// Author: Jesus E. Vazquez

// What is this code about?
// The first argument will be the number whose multiples will be replaced with
// “Fizz”, the second argument will be the number whose multiples will be replaced by “Buzz”,
// and the third argument will be the upper limit for the numbers you will print. Numbers
// that are multiples of both the first and second argument will be replaced by “FizzBuzz”

// Input 3 arguments
// Output a sequence of numbers starting at 1 and going all the way to arg[3]. Every multple of 
// arg[1] will be replaced by "Fizz" and every multiple of Buzz will be replaced by "Buzz". 
// Numbers that are multples of both of them will be replaced by "FizzBuzz"

public class FizzBuzz {
    /**
     * Program takes two numeric arguments and tells the user their sum.
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        // A tiny bit of error checking to make sure the correct
        // number of arguments are used.
        if(args.length != 3) {
            // wrong number of arguments, so complain about it.
            System.err.println("Expected 3 arguments, but got " + args.length);
        } 
        else {
            // Arguments are Strings, so use static method in Integer
            // class to convert to numbers. 
            int firstVal = Integer.parseInt(args[0]);
            int secondVal = Integer.parseInt(args[1]);
            int thirdVal = Integer.parseInt(args[2]);

            for (int i=0;i < thirdVal ; ++i){
                double sequenceNumbers = i + 1;

                // First Argument
                double divisionNumbers_first = sequenceNumbers / firstVal;
                int divisionNumbers_first_integer = (int) divisionNumbers_first;

                // Second Argument
                double divisionNumbers_second = sequenceNumbers / secondVal;
                int divisionNumbers_second_integer = (int) divisionNumbers_second;

                // Iterating over the values

                // FizzBuzz
                if (divisionNumbers_first == divisionNumbers_first_integer && divisionNumbers_second == divisionNumbers_second_integer) {
                    System.out.println("FizzBuzz");
                } 
                // Fizz
                else if (divisionNumbers_first == divisionNumbers_first_integer) {
                    System.out.println("Fizz");
                }
                // Buzz
                else if (divisionNumbers_second == divisionNumbers_second_integer) {
                    System.out.println("Buzz");
                } 
                else {
                    System.out.println((int)sequenceNumbers);
                }
                }

        }
    }
}


