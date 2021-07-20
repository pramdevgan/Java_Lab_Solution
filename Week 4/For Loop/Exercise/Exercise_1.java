///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                                                                              Loops: Exercise 1

// When your code is ready, click the button below to submit your work for grading. Reminder: Make sure you fulfill all of the requirements above before submitting your work.

// The first step is to figure out the pattern that tina moves. First tina moves forward by 100 pixels. Then tina turns left 120 degrees. 
// Thus tina's commands are tina.forward(100) and then tina.left(120). This pattern happens exactly three times.

// Next is setting the loop so that tina's commands are iterated three times. Per requirements, your loop header should include int i = 0 and i++. 

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                                                                    // Here are some possible solutions:





                                       // Solution 1
for(int i = 0; i < 3; i++) {
  tina.forward(100);
  tina.left(120);
}


                                       // Solution 2
for(int i = 0; i <= 2; i++) {
  tina.forward(100);
  tina.left(120);
}
