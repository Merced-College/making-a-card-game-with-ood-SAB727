public class Card {
    //data variables
    private String cardSuit;

    private String cardName;

    private int cardValue;

    private String cardPicture;
    
    public Card () {
        cardSuit = "";
        cardName = "";
        cardValue = 0;
        cardPicture = "";
    }
    
    //constructor
    public Card (String cardSuit, String cardName, int cardValue, String cardPicture) {
        this.cardSuit = cardSuit;
        this.cardName = cardName;
        this.cardValue = cardValue;
        this.cardPicture = cardPicture;
    }

        

    
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
}