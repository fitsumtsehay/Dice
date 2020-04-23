/*
*play roll dice
accumulate turn score
*display current roll and total score
*ask user’s input whether to roll again
*if (user’s choice == ‘yes’)
*Roll again
*check for score
*if (score > 100)
*exit do-while loop
*display “You have scored over 100
*Thank you for playing!”
*else
*accumulate turn score
*/


import java.io.DataInput;
import java.io.IOException;
import java.util.*;

public class Dice2 {
    private static DataInput Keyboard;

    public static void main(String[] args) throws IOException {
            // variable declarations
            int die1, die2, roll, firstroll;
            // Each die is a random integer from 1-6; each of
            // 'roll' and 'firstroll' is the sum of two dice.
            char game = 'y';             // User decides when to quit playing
            System.out.println("Welcome! Let's Play Roll Dice!");
            // Each time through the loop, play one game and display the result
            while (game == 'y') {
                // compute first roll
                die1 = (int)(Math.random()*6 + 1);
                die2 = (int)(Math.random()*6 + 1);
                firstroll = die1 + die2;

                if (firstroll == 7 || firstroll == 11)
                    System.out.println("" + firstroll + "");
                else if (firstroll == 2 || firstroll == 3 || firstroll == 12)
                    System.out.println("" + firstroll + "");
                else {
                    System.out.print("You rolled " + firstroll);
                    die1 = (int)(Math.random()*6 + 1);
                    die2 = (int)(Math.random()*6 + 1);
                    roll = die1 + die2;
                    while (roll != firstroll && roll != 7) {
                        System.out.print(", " + roll);
                        die1 = (int)(Math.random()*6 + 1);
                        die2 = (int)(Math.random()*6 + 1);
                        roll = die1 + die2;
                    } // end of while loop
                    System.out.print(", " + roll);
                    if (roll == firstroll)
                        System.out.println("");
                    else
                        System.out.println("");
                }
                System.out.println("Want to play again? (y/n)");
                game = Keyboard.readChar();
            } // end of while loop
        }}