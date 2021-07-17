///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                                                       // Conditionals Exercise 3

        // Problem

// Use the variable x as you write this program. x will represent a positive integer. Write a program that determines if x is divisible by 5 and even. If yes, print _ is divisible by 5 and even, where the blank is the value of x. If no, print _ is not divisible by 5 or it is odd, where the blank is the value of x.
// Expected Output
// If x is 8, then the output would be: 37 is not divisible by 5 or it is odd.
// If x is 80, then the output would be: 50 is divisible by 5 and even.
// If x is 105, then the output would be: 37 is not divisible by 5 or it is odd.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                                              //////Solution//////


public class Exercise3 {
  public static void main(String args[]) {
    
    int x = Integer.parseInt(args[0]);
    //add code below this line

if (x % 5 == 0 && x % 2 ==0){
  System.out.println(String.valueOf(x) +" is divisible by 5 and even");
}
    else {
      System.out.println(String.valueOf(x) +" is not divisible by 5 or it is odd");
    }
    
    //add code above this line
  }
}
