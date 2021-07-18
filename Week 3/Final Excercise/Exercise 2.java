///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                                                                          // Conditionals Exercise 2


// Problem
// Use the variable x as you write this program. x will represent a positive integer. Write a program that determines if x is divisible by 5. 
// If yes, print _ is divisible by 5, where the blank is the value of x. If no, print _ is not divisible by 5, where the blank is the value of x

// Expected Output
// If x is 50, then the output would be: 50 is divisible by 5.
// If x is 37, then the output would be: 37 is not divisible by 5.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                                                                          // Solution


public class Exercise2 {
  public static void main(String args[]) {
    
    int x = Integer.parseInt(args[0]);
    //add code below this line
if (x % 5 == 0){
  System.out.println(String.valueOf(x) +" is divisible by 5");
}
    else {
      System.out.println(String.valueOf(x) +" is not divisible by 5");
    }

    
    //add code above this line
  }
}
