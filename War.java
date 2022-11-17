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
        Scanner scanner = new Scanner(System.in);

    }
    
    /**
     * The main method is called when Java starts your program
     */
    public static void main(String[] args) {
        War war = new War();
        war.runEventLoop();
    }

}
