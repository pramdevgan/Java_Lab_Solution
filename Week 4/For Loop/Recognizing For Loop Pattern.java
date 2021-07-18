                                                                                  /////// For Loop///////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Given the following code snippet:

tina.forward(100);
tina.right(90);
tina.forward(100);
tina.right(90);
tina.forward(100);
tina.right(90);
tina.forward(100);
tina.right(90);

//Select all of the following that will produce the same output as the code above using a for loop?
/////////////////////////////////////////////////////////////////////////// Answer ///////////////////////////////////////////////////////////////////////////////////////////////


//Option_1 Correct
for (int i = 0; i < 4; i++) {
  tina.forward(100);
  tina.right(90);
}

//Option_2
for (int i = 1; i < 4; i++) {
  tina.forward(100);
  tina.right(90);
}

//Option_3 Correct
for (int i = 1; i < 5; i++) {
  tina.forward(100);
  tina.right(90);
}

//Option_4 Correct
for (int i = 20; i < 24; i++) {
  tina.forward(100);
  tina.right(90);
}
