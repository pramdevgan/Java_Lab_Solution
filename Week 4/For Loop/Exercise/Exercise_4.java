                                                                // Breaking the Loop
// The following program (also shown in the text editor on the left) contains one or more infinite loops that prevent the program from printing the desired output.
public class Exercise4 {
  public static void main(String args[]) {
    
    for (int i = 100; i <= 100; i--) {
      while (true) {
        System.out.println("Print me!");
      }
    }
  }
}
// TRY IT
// Using what you know about break statements, fix the program so that it runs, prints correctly, and terminates successfully.
// Requirements
// You cannot make any changes to the code that already exists. If you accidentally delete any existing code, you can copy and paste the entire program from above.
// You need to add two and only two break; statements to the program.
// The program’s expected output is: Print me!
// TRY IT
// Loops: Exercise 4
// When your code is ready, click the button below to submit your work for grading.
                                          // Solution
// The only places where you can add a break; statement to successfully print Print me! and solve the infinite loops are 1) after System.out.println("Print me!"); 
// and 2) after the first closing curly brace } that was initially on line 7 in the original code. See solution below:

for (int i = 100; i <= 100; i--) {
  while (true) {
    System.out.println("Print me!");
    break;
  }
  break;
}
// Both the for and while loops in the code cause the program to run indefinitely. 
// The first break; statement in the solution will allow the program to exit the while loop and the second break; 
// statement in the solution will allow the program to exit the for loop. In order for Print me! to be printed, the break; statement must go after the print statement.
