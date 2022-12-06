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
        System.out.println("War Game");
        System.out.println("Player 1 has " +players[0].getDeckSize()+ " and player 2 has "+ players[1].getDeckSize()+ ".");
        for (int turns = 1; turns <= 300; turns++) {
            if (players[1].getDeckSize() == 0) {
                System.out.println("PLAYER 1 WON THE GAME");
                break;
            } else if (players[0].getDeckSize() == 0) {
                System.out.println("PLAYER 2 WON THE GAME");
                break;
            } else {
                System.out.println();
                System.out.println("\n[Round " + turns + "]");
                Card p1Card = players[0].dealCardFromDeck();
                Card p2Card = players[1].dealCardFromDeck();
                System.out.println("Player 1 has "+players[0].getDeckSize()+" cards");
                System.out.println("PLayer 2 has "+players[1].getDeckSize()+" cards");
                if (p1Card.getRank() > p2Card.getRank()){
                    System.out.println("p1: "+p1Card.getFace()+ p1Card.getSuit()+" p2: "+ p2Card.getFace()+ p2Card.getSuit());
                    System.out.print("player 2 lost");
                    players[0].addCardToDeck(p1Card);
                    players[0].addCardToDeck(p2Card);
                } else if (p1Card.getRank() < p2Card.getRank()){
                    System.out.println("p1: "+p1Card.getFace()+ p1Card.getSuit()+" p2: "+ p2Card.getFace()+ p2Card.getSuit());
                    System.out.print("player 1 lost");
                    players[1].addCardToDeck(p1Card);
                    players[1].addCardToDeck(p2Card);
                } else {
                    if (players[0].getDeckSize() <= 3) {
                        System.out.println("Player 1 doesn't have enough cards to initiate a war");
                        System.out.println("Player 2 wins");
                        break;
                    } else if (players[1].getDeckSize() <= 3) {
                        System.out.println("Player 2 doesn't have enough cards to initiate a war");
                        System.out.println("Player 1 wins");
                        break;
                    } else {
                        System.out.println("\n⚠⚠⚠⚠ THIS IS WAR ⚠⚠⚠⚠");
                        Deck war = new Deck();
                        war.addCardToDeck(p1Card);
                        war.addCardToDeck(p2Card);
                        if (players[0].getDeckSize() ==0 ){
                            System.out.println("Player 2 wins the game");
                            break;
                        } else if (players[1].getDeckSize() ==0) {
                            System.out.println("Player 2 wins the game");
                            break;
                        } else {
                            for(int i = 0; i<4; i++){
                                p1Card = players[0].dealCardFromDeck();
                                p2Card = players[1].dealCardFromDeck();
                                war.addCardToDeck(p1Card);
                                war.addCardToDeck(p2Card);
                            }
                            p1Card = players[0].dealCardFromDeck();
                            p2Card = players[1].dealCardFromDeck();
                            if (p1Card.getRank() > p2Card.getRank()) {
                                players[0].addCardToDeck(p1Card);
                                players[0].addCardToDeck(p2Card);
                                Card wins;
                                for (int i = 0; i < 4; i++) {
                                    wins = war.dealCardFromDeck();
                                    players[0].addCardToDeck(wins);
                                }
                                System.out.println("Player 1 wins WAR!");
                            } else if (p1Card.getRank() < p2Card.getRank()) {
                                players[1].addCardToDeck(p2Card);
                                players[1].addCardToDeck(p1Card);
                                Card wins;
                                for (int i = 0; i < 4; i++) {
                                    wins = war.dealCardFromDeck();
                                    players[1].addCardToDeck(wins);
                                }
                                System.out.println("Player 2 wins WAR!");
                            }
                        }
                    }
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
