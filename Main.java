import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Card> playerHand = new ArrayList<>();
    private static List<Card> dealerHand = new ArrayList<>();
    private static Deck deck;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        deck = new Deck();
        startGame();
        
        while (true) {
            System.out.println("Your hand: " + handValue(playerHand));
            System.out.println("Dealer's hand: " + dealerHand.get(0).getNum() + " of " + dealerHand.get(0).getSuit() + " and [Hidden]");
            System.out.print("Do you want to hit or stand? ");
            String action = scanner.nextLine();

            if (action.equalsIgnoreCase("hit")) {
                playerHand.add(deck.drawCard());
                if (handValue(playerHand) > 21) {
                    System.out.println("You bust! Dealer wins.");
                    return;
                }
            } else if (action.equalsIgnoreCase("stand")) {
                break;
            }
        }

        dealerPlay();
        determineWinner();
        scanner.close();
    }

    private static void startGame() {
        playerHand.add(deck.drawCard());
        playerHand.add(deck.drawCard());
        dealerHand.add(deck.drawCard());
        dealerHand.add(deck.drawCard());
    }

    private static void dealerPlay() {
        while (handValue(dealerHand) < 17) {
            dealerHand.add(deck.drawCard());
        }
    }

    private static int handValue(List<Card> hand) {
        int value = 0;
        int aces = 0;
        
        for (Card card : hand) {
            value += card.getNum();
            if (card.getNum() == 1) aces++; // Count Aces
        }
        
        while (value > 21 && aces > 0) {
            value -= 10; // Adjust for Ace
            aces--;
        }
        
        return value;
    }

    private static void determineWinner() {
        int playerValue = handValue(playerHand);
        int dealerValue = handValue(dealerHand);

        System.out.println("Your hand value: " + playerValue);
        System.out.println("Dealer's hand value: " + dealerValue);

        if (dealerValue > 21 || playerValue > dealerValue) {
            System.out.println("You win!");
        } else if (playerValue < dealerValue) {
            System.out.println("Dealer wins.");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
