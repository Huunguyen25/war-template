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
    Deck deck;
    boolean justWar;
    ArrayList <Card> p1Pile, p2Pile;
    /**
     * Constructor for the game
     * Include your initialization here -- card decks, shuffling, etc
     * Run the event loop after you've done the initializations
     */
    public War()
    {
        // Initializations here...
        deck.initializeNewDeck();
        justWar = true;
        p1Pile = new ArrayList<Card>();
        p2Pile = new ArrayList<Card>();
        deck.shuffle(); 
        // ...then run the event loop
        this.runEventLoop();
    }
    
    /**
     * This is the game's event loop. The code in here should come
     * from the War flowchart you created for this game
     */
    public void runEventLoop() {
        int LIMIT = 300;
        int winner = -1, turns = 0;
        while(turns < LIMIT && ) {
            System.out.println("Player 1 has" + + "cards and Player 2 has " + + "cards");
            Card c1 = p1Pile.remove(0);
            Card c2 = p2Pile.remove(0);
            System.out.println("Player 1 plays "+c1+" and player 2 plays "+c2);
            if() {
                System.out.println("WAR!");
                if(p1Pile.size() < 3) {
                    winner = 2;
                    System.out.println("Player 1 does not have enough cards for war");
                    break;
                } else if (p1Pile.size() < 3) {
                    winner = 1;
                    System.out.println("Player 1 does not have enough cards for war");
                    break;
                } else {
                    tmp = new ArrayList<Card>();
                    for (int i = 0; i<2; i++) {
                        tmp.add(p1Pile.remove(0));
                        tmp.add(p2Pile.remove(0));
                    }
                    
                }
            }
        }
    }
    
    /**
     * The main method is called when Java starts your program
     */
    public static void main(String[] args) {
        War war = new War();
        war.runEventLoop();
    }

}
