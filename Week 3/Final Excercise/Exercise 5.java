//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                                          // Exercise 5
              // Conditionals Exercise 5
// Problem
// Use the variable x as you write this program. x will represent a string. Write a program that determines if x is a vowel (a, e, i, o, and u ). 
// If yes, print _ is a vowel, where the blank is the value of x. If no, print _ is not a vowel, where the blank is the value of x.
// Expected Output
// If x is a, then the output would be: a is a vowel.
// If x is z, then the output would be: z is not a vowel.
// Comparing Strings
// If you choose to directly compare Strings, you may be tempted to write x == "a". However, this won't behave as expected. Instead, use .equals(). For example, x.equals("a").

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                                                                            ////// Solution _1//////

public class Exercise5 {
  public static void main(String args[]) {
    
    String x = args[0];
    //add code below this line

if( x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u"))
  {System.out.println(x + " is a vowel");}
else
  {System.out.println(x + " is not a vowel");}
    
    
                                                                       ////// Solution_2//////
    
switch (x) {
    case "a": case "e": case "i": case "o": case "u": System.out.println(x + " is a vowel"); break;
    default: System.out.println(x + " is not a vowel"); break;
} 
  
    
    //add code above this line
  }
}
