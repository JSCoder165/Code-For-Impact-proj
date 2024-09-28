public class Card {
    private int num; 
    private String suit;
    private boolean isJack;
    public Card(int num, String suit){
        this.num = num;
        this.suit = suit;
        isJack = num == 11;
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
