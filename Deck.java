import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        for (String suit : suits) {
            for (int i = 1; i <= 13; i++) {
                cards.add(new Card(Math.min(i, 10), suit)); 
            }
        }
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(cards.size() - 1); 
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }
}
