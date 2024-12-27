Dice Rolling Simulator

The Dice Rolling Simulator is a console-based Java application that simulates rolling one or more dice. The user specifies how many dice they want to roll, and the program generates random results for each die. This game is a simple demonstration of random number generation and basic control flow in Java.

Features:
User Input for Dice Count: The player specifies how many dice they want to roll.
Random Dice Rolls: The program generates random numbers between 1 and 6 for each die.
Dice Display: Each die roll is displayed in a visual format using ASCII art, showing the face of the die.
Error Handling: The program ensures the user inputs a valid number for dice rolls. If an invalid input is provided, it prompts the user to enter a valid number.


Dice Rolling Simulator
The Dice Rolling Simulator is a console-based Java application that simulates rolling one or more dice. The user specifies how many dice they want to roll, and the program generates random results for each die. This game is a simple demonstration of random number generation and basic control flow in Java.

Features:
User Input for Dice Count: The player specifies how many dice they want to roll.
Random Dice Rolls: The program generates random numbers between 1 and 6 for each die.
Dice Display: Each die roll is displayed in a visual format using ASCII art, showing the face of the die.
Error Handling: The program ensures the user inputs a valid number for dice rolls. If an invalid input is provided, it prompts the user to enter a valid number.

How It Works:

Game Initialization:
The game prompts the player to specify how many dice they wish to roll.
The program verifies that the input is a valid integer (a positive number) using error handling.

Rolling the Dice:
For each die, the program generates a random number between 1 and 6 (inclusive) using the Random class in Java.
After generating the random value, the program displays the corresponding die face in a visual format.

Displaying Dice Faces:
The die faces are displayed using ASCII art based on the rolled number. For example, if a die rolls a 3, it displays the ASCII art for a die with three pips.

Error Handling:
If the user enters an invalid input (e.g., a non-integer or a negative number), the program catches the exception and prompts the user to enter a valid number again.

Replay Option:
The program allows the user to roll the dice again by re-running the program or exiting after each round.
