// Conditionals Exercise 1
// Problem
// Use the variable x as you write this program. x will represent a positive integer. Write a program that determines if x is between 0 and 25 or between 75 and 100. If yes, print the message:_ is between 0 and 25 or 75 and 100, where the blank would be the value of x. The program should do nothing if the value of x does not fit into either range.
// Note: These are inclusive ranges - 0, 25, 75 and 100 should print out the message.
// Type Casting

// Expected Output
// If x is 8, then the output would be: 8 is between 0 and 25 or 75 and 100.
// If x is 80, then the output would be: 80 is between 0 and 25 or 75 and 100.
// If x is 100, then the output would be: 100 is between 0 and 25 or 75 and 100.

              <h1> Solution<h1>
public class Exercise1 {
  public static void main(String args[]) {
    
    int x = Integer.parseInt(args[0]);
    //add code below this line
if( (x >= 0 && x <=25) || (x >= 75 && x <=100) )
    { System.out.println(String.valueOf(x) + " is between 0 and 25 or 75 and 100"); }
    
    //add code above this line
  }
}
