public class Card {
    private int num; 
    private String suit;
    private boolean isJack;
    private boolean isAce;

    public Card(int num, String suit, boolean isJack, boolean isAce){
        this.num = num;
        this.suit = suit;
        this.isJack = isJack;
        this.isAce  = isAce;
    }

    public String getSuit(){
        return suit;
    }

    public int getNum(){
        return num;
    }
    
    public boolean isJack() {
        return isJack;
    }

    public boolean isAce() {
        return isAce;
    }

}
