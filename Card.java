public class Card {
    private int num; 
    private String suit;
    private boolean isJack;
    public Card(int num, String suit, boolean isJack){
        this.num = num;
        this.suit = suit;
        this.isJack = isJack;
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

}
