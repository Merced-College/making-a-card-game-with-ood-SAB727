//Shane
//Tristen
//Dylan
//9/23/25
//Arraylist card game with OOP

public class Card {
    //data variables
    private String cardSuit;
    private String cardName;
    private int cardValue;
    private String cardPicture;
    
    //default constructor
    public Card () {
        cardSuit = "";
        cardName = "";
        cardValue = 0;
        cardPicture = "";
    }
    
    //parameterized constructor
    public Card (String cardSuit, String cardName, int cardValue, String cardPicture) {
        this.cardSuit = cardSuit;
        this.cardName = cardName;
        this.cardValue = cardValue;
        this.cardPicture = cardPicture;
    }

    // Accessors (getters)
    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardName() {
        return cardName;
    }

    public int getCardValue() {
        return cardValue;
    }

    public String getCardPicture() {
        return cardPicture;
    }

    // Mutators (setters)
    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public void setCardPicture(String cardPicture) {
        this.cardPicture = cardPicture;
    }

    // toString method
    @Override
    public String toString() {
        return "Card{" + "cardSuit='" + cardSuit + '\'' + ", cardName='" + cardName + '\'' + ", 
        cardValue=" + cardValue + ", cardPicture='" + cardPicture + '\'' +'}';
    }
}