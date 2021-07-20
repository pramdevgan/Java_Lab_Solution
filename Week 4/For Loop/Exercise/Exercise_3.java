//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                                            // Consecutive Sums

// You are trying to produce a program that takes in two integer arguments from the user and then prints the consecutive sum of all numbers between those integers inclusively. 
// For example, arguments 5 and 8 will result in a sum of 26 (5 + 6 + 7 + 8 = 26). If the integer arguments are the same value, the program will simply print that value as the sum.

                                // Requirements
// Declare and initialize a variable to keep tracking of your sum.
// Use any loop to find the consective sum between the integer variables a and b.
// If a and b are the same integers, then print either a or b as the sum.
// What does the if (a > b) conditional in the code do?

// The if conditional enables the program to sort the arguments from the user from smaller to larger. 
// For example, if the user types 8 and 5, the conditional will rearrange the arguments so that a takes on the smaller argument of 5 and b takes on the larger argument of 8.



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



                                                                    // Here are some possible solutions:
                                          // Solution 1

// You can use either the for or while loop to complete this assignment. If using a for loop, the iterating variable should start at a and get incremented by 1 until it reaches b.
// Below is a sample solution involving the for loop.

int sum = 0;
  
for (int iter = a; iter <= b; iter++) {
  sum += iter;
}
  
if (a == b) {
  sum = a;
}
  
System.out.println(sum);


                                          // Solution 2


// Alternatively, you can use the while loop by setting the iterating variable to a and incrementing it by 1 after each time it gets added to the sum. 
// Here is a solution that uses the while loop:


int sum = 0;
int iter = a;
  
while (iter <= b) {
  sum += iter;
  iter++;
}
  
if (a == b) {
  sum = a;
}
  
System.out.println(sum);
