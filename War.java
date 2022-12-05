import java.util.Scanner;
import java.util.ArrayList;

/**
 * War game class
 *
 * @author Mr. Jaffe
 * @version 2022-10-19
 */
public class War
{
    Deck[] players;
    /**
     * Constructor for the game
     * Include your initialization here -- card decks, shuffling, etc
     * Run the event loop after you've done the initializations
     */
    public War()
    {
        // Initializations here...
        Deck deck = new Deck();
        deck.initializeNewDeck();
        deck.shuffle();
        players = deck.dealDeck();        
       // ...then run the event loop
        this.runEventLoop();
    }
    
    /**
     * This is the game's event loop. The code in here should come
     * from the War flowchart you created for this game
     */
    public void runEventLoop() {
        System.out.println("This is WAR!");
        System.out.println("Player 1 has " +players[0].getDeckSize()+ " and player 2 has "+ players[1].getDeckSize()+ ".");
        for (int turns = 0; turns < 300; turns++) {
            if (players[1].getDeckSize() == 0) {
                System.out.println("Player 1 won the game");
                break;
            } else if (players[0].getDeckSize() == 0) {
                System.out.println("Player 2 won the game");
                break;
            } else {
                System.out.println("[Round " + turns + "]");
                Card p1Card = players[0].dealCardFromDeck();
                Card p2Card = players[1].dealCardFromDeck();
                if (p1Card.getRank() > p2Card.getRank()){
                    System.out.println("player 1 played → " +p1Card.getRank());
                    System.out.print("player 2 lost");
                    players[0].addCardToDeck(p1Card);
                    players[0].addCardToDeck(p2Card);
                }
                if (p1Card.getRank() == p2Card.getRank()) {
                    
                }
            }
        }
    }
    
    /**
     * The main method is called when Java starts your program
     */
    public static void main(String[] args) {
        System.out.print("\u000C");
        War war = new War();
    }

}
