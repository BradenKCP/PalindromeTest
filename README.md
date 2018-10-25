Palindrome Test

The purpose of this program is to take a word of phrase from the user and test to see if it is a palindrome. The program takes the input from the user and enters each character into a stack. The elements of the stack are then removed and arranged into a new term that is the reverse of the original. At this point the original phrase can easily be tested as a palindrome by comparing it to the reversed phrase and seeing if they are equal. 

Lines 1 & 2
The first thing in this program is to import the necessary utility packages. For this program, “Stack” and “Scanner” are used. The “Stack” package is the primariy logic for reversing the phrase, and the “Scanner” package is used to get an input from the user. 
 
Lines 8 - 10
The next part of the program initializes a few things before the primary while loop. This includes the “testing” Boolean, the scanner input, and the character stack. 
 
Lines 12 - 16
Next, the primary while loops is created. This while loop handles all of the palindrome logic. The parameter for this loop is the “testing” Boolean. This is so the user can indicate if they would like to keep testing words or quit the program. The first thing that takes place in this while loop is getting an input from the user. The program prompts the user for a string and uses the scanner to save the result as a string labeled “inputString”. Once this is done a blank string is created and labeled as “reverseString” for future use.  
 
Lines 18 - 20
The first bit of logic is introduced as a for loop is utilized on each character of the input string as each character is placed in the stack. The parameter for the for loop is the length of “inputString”. 
 
Lines 22 - 24
Next a while loop is used to pop each element of the stack off. As an element is popped off it is immediately added to the “reverseInput” string. This while loop continues until the stack is empty.
 
At this point we have 2 main strings. The original string entered by the user, “inputString”, and the reverse of this string, “reverseString”. The reason a stack was used is because as elements are added into a stack, the first one entered is the last one that comes out. This is useful for reversing strings as the first character entered into the stack, will be the last one we remove, producing a result that is backwards the original. 

Lines 26 - 31
All that is left to do is compare the 2 string. An if statement is used to compare the original string to the reverse string. If they are equal, the program lets the user know that it is indeed a palindrome. And additionally, an else statement is used if this is not true to indicate to the user that the statement is not a palindrome.  

Lines 33 - 35
Lastly, the program prompts the user for if they would like to test another palindrome. If the user enters anything other than a “y” or “Y”, then the program ends. Otherwise, the while loop condition is still met as testing remains true, and another input will be prompted to the user in order to test another palindrome. 
 
