//Shane
//Tristen
//Dylan
//9/23/25
//Arraylist card game with OOP

public class Card {
    //Shane: data variables
    private String cardSuit;
    private String cardName;
    private int cardValue;
    private String cardPicture;

    //Shane: default constructor
    public Card () {
        cardSuit = "";// Shane: default suit
        cardName = "";// Shane: default name
        cardValue = 0;// Shane: default value
        cardPicture = "";// Shane: default picture
    }

    //Shane: parameterized constructor
    public Card (String cardSuit, String cardName, int cardValue, String cardPicture) {
        this.cardSuit = cardSuit;// Shane: default suit
        this.cardName = cardName;// Shane: default name
        this.cardValue = cardValue;// Shane: default value
        this.cardPicture = cardPicture;// Shane: default picture
    }

    //Shane: Accessors (getters)
    public String getCardSuit() {
        return cardSuit;// Shane: return cards suit
    }

    public String getCardName() {
        return cardName;// Shane: return cards name
    }

    public int getCardValue() {
        return cardValue;// Shane: return cards value
    }

    public String getCardPicture() {
        return cardPicture;// Shane: return cards picture
    }

    //Shane: Mutators (setters)
    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;// Shane: set cards suit
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;// Shane: set cards name
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;// Shane: set cards value
    }

    public void setCardPicture(String cardPicture) {
        this.cardPicture = cardPicture;// Shane: set cards picture
    }

    //Shane: toString method
    @Override
    public String toString() {
        return "Card: Suit = " + cardSuit + ", Name = " + cardName + ", Value = " + cardValue + ", Picture = " + cardPicture;
    }
}