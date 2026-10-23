# Password-game
_Password .06_

**The goal** of a password validation game is mostly to challenge the player to be as creative as possible, as they try to make the password conform to all given rules. There are many possibilities to add even more rules to the basis, which will make it harder to create a valid password.

This project includes the following files:
1. JFramePassGameOne - This is the GUI and where the game is played.
This file calls files 2 and 3.
The project also includes a .form file with the same name, this is used for the layout and dimensions of the GUI
2. PassGameOne - This file includes all methods for checking the input.
The input is passed through all the checking methods and returns the validity.
3. PassCheckOne - This file checks if there is any conflict between rules.
_This file is not fully needed yet, because conflict between rules does not exist with the original 6 implemented rules._
_________________________________________

**GUI setup**
- The GUI of the game includes an entry field, 'check' button, 'reset' button, an output field, and a progress bar.
- After the user enters their password input and either clicks the 'check' button or the 'enter' key on their keyboard, the password is checked.
- The output field shows the first rule that is invalid. (_When rule 1 is validated, rule 2 is shown, and so on_)
- The progress bar shows the user how close they are.

**To start up project**
1. Programs: Make sure Java and Java Swing are runnable on the device. NetBeans IDE was used to creat this project, so it is advised to open the project in this application.
2. Download the zip folder and extract the files.
3. Open the project in Java IDE, and make sure all files are placed in the same folder/package.
4. Compile and run the project. The main() method that runs the project is located in JFramePassGameOne.




