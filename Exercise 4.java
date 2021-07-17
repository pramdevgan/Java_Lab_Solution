///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                                                     // Exercise 4

        // Conditionals Exercise 4
// Problem
// Use the variable x as you write this program. x will represent a string. Write a program that determines if x is a primary color (red, blue, or yellow). 
// If yes, print _ is primary color, where the blank is the value of x. If no, print _ is not a primary color, where the blank is the value of x.

// Expected Output
// If x is red, then the output would be: red is a primary color.
// If x is teal, then the output would be: teal is not a primary color.
// Comparing Strings
// If you choose to directly compare Strings, you may be tempted to write x == "red". However, this won't behave as expected. Instead, use .equals(). For example, x.equals("red").

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                                                //////// Solution_1 /////////


public class Exercise4 {
  public static void main(String args[]) {
    
    String x = args[0];
    //add code below this line

if( x.equals("yellow") || x.equals("red") || x.equals("blue") )
    {System.out.println(x + " is a primary color");}
else
    {System.out.println(x + " is not a primary color");}
    
                                                                               /////// Solution_2 ////////
    
switch (x) {
    case "yellow": case "red": case "blue": System.out.println(x + " is a primary color"); break;
    default: System.out.println(x + " is not a primary color"); break;
}

    
    //add code above this line
  }
}
