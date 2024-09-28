public class Card {
    private int num; //card value from 1-10
    private String suit;
    private boolean isJack;
    public Card(int num, String suit, boolean isJack){
        this.num = num;
        this.suit = suit;
    }

    public String getSuit(){
        return suit;
    }

    public int getNum(){
        return num;
    }

}
