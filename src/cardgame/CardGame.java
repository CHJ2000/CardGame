package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 * This is main class for Java programs
 * @author Carter Jeffery
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner for input
        Scanner input = new Scanner(System.in);
        
        //create an array to hold 7 cards
        Card[] hand = new Card[7];
        
        // use Random class to generate random numbers
        Random random = new Random();
        
        for (int i = 0; i < hand.length; i++){
            int value = random.nextInt(13);
            String suit = Card.SUITS[random.nextInt(4)];
            
            Card card = new Card(value, suit);
            hand[i] = card;
        }
            // print out the cards generated for debugging purposes
            System.out.println("Here are the cards in the hand");
            for(Card card: hand){
                System.out.printf("%s of %s\n", card.getValue(), card.getSuit());
            }
            // Now ask the user for a card
            System.out.println("Pick a suit for your card: ");
            for(int i = 0; i < Card.SUITS.length; i++){
                System.out.println((i + 1) + " : " + Card.SUITS[i]);
            }
            int suit = input.nextInt();
            
            System.out.print("Enter a value (1-13)");
//            for(int i = 0; i < Card.Value.values().length; i++){
//                System.out.println((i + 1) + ": " + Card.Value.values()[i]);
//            }
            int value = input.nextInt();
            
            Card userGuess = new Card(value, Card.SUITS[suit]);
            
            //now check for a match
            boolean match = false;
            for (Card card: hand){
                if(card.getValue() == userGuess.getValue() && card.getSuit().equals(userGuess.getSuit())){
                    match = true; // its a match
                    break; // no need to continue
                }
            }
            // Use ternary operator
            String response = match ? "You guessed it right!" : "Sorry no match...";
            System.out.println(response);
        }
    }


