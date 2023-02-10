package cardgame;

public class Card {
   private String suit;
   private int value;
   
   public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    // created a two argument constructor
    public Card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }
    
    public int getValue() {
        return this.value;
    }

    /**
     * 
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return this.suit;
    }

    /**
     * 
     * @param suit
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }



    public enum Suit {
        HEARTS,
        CLUBS,
        SPADES,
        DIAMONDS
    }


    public enum Value {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }

}