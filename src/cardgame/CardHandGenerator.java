package cardgame;

import java.util.Random;

public class CardHandGenerator {

    /**
     * 
     * @param numCards
     * @return 
     */
    public static Card[] generateHand(int numCards) {
               //create an array to hold 7 cards
        Card[] hand = new Card[numCards];
        
        // use Random class to generate random numbers
        Random random = new Random();
        
        for (int i = 0; i < hand.length; i++){
            int numValues = Card.Value.values().length;
            Card.Value value = Card.Value.values()[random.nextInt(numValues)];
            
            int numSuits = Card.Suit.values().length;
            Card.Suit suit = Card.Suit.values()[random.nextInt(numSuits)];
            Card card = new Card(value, suit);
            hand[i] = card;
    }
return hand;
}
    }