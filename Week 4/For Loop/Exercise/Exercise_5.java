/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                                                // “Count-Up”

// For this assignment, you will use a nested loop to produce the unique output below.

....1
...2
..3
.4
5
    
                                                                                // Requirements:
  
// You must include two and only two loops in your code, one nested inside of another.
// You must include two and only two System.out.print or System.out.println statements, one for each of your loop.  
  
  
// The first step is to recognize the two patterns that exist. Notice how the numerical values are printed in ascending order starting at 1 and ending at 5. 
// Thus, you should implement a loop that starts and ends according to the line number (e.g. for (int i = 1; i < 6; i++)). 
// In addition, each iteration should print the existing line number followed by a newline character (e.g. System.out.println(i);).

// Second, the . start at 4 and then decreases by 1 after every iteration until it reaches zero. An example loop header could be for (int j = <number of periods>; j > 0; j--).

// Now all that’s left to do is to combine the two loops in a manner that associates BOTH loops. Notice how the line number can also represent how many . are replaced. 
// So the second loop can be rewritten as for (int j = 5 - i; j > 0; j--).
// Another important detail is to not include ln when printing . because it will cause the . to be on different lines (e.g. System.out.print(".");). 
// Below is a sample solution using a nested for loop but any two combinations of for and while loops will work.
  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
                                                                    // Solution  
  
 for (int i = 1; i < 6; i++) 
 {
   for (int j = 5 - i; j > 0; j--)
   {
    System.out.print(".");
  }
  System.out.println(i);
}
