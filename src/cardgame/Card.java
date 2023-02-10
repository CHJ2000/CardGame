package cardgame;

public class Card {

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
    
    private Value value;
    private Suit suit;

    
    // created a two argument constructor
    public Card(Value value, Suit suit){
        this.value = value;
        this.suit = suit;
    }
    
    public Value getValue() {
        return this.value;
    }

    /**
     * 
     * @param value
     */
    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    /**
     * 
     * @param suit
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

}