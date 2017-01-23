package example.codeclan.com.olderyoungercardgame;

import java.util.Scanner;

/**
 * Created by user on 20/01/2017.
 */

public class Game {

    private GameCards cards;
    private String player;
    private String computer;
    private int computerWins;
    private int playerWins;

    public Game(){
        this.cards = new GameCards();
        this.player = getRandomCard();
        this.computer = getRandomCard();
        this.computerWins = 0;
        this.playerWins = 0;
    }

    //random card
    public String getRandomCard() {
        return cards.getRandomKeyAndValue();
    }

    public String thePlayerCard(){
        return "Your card was " + player;
    }

    public int getPlayerCardValue(){
        Scanner scan = new Scanner(player).useDelimiter("[^0-9]+");
        int integer = scan.nextInt();
        return integer;
    }

    public String theComputerCard() {
        return "The computer's card was " + computer;
    }

    public int getComputerCardValue(){
        Scanner scan = new Scanner(computer).useDelimiter("[^0-9]+");
        int integer = scan.nextInt();
        return integer;
    }

    //checkwin methods!
    public String winLogic() {
        if (getPlayerCardValue() < getComputerCardValue()) {
            computerWins++;
            return "You lose, the computer's card was older!" + "\n"
                    + thePlayerCard();
        }
        else if (getPlayerCardValue() > getComputerCardValue()) {
            playerWins++;
            return "You win, you're card was older!" + "\n"
                    + thePlayerCard();
        }
        else if (getPlayerCardValue() == getComputerCardValue()) {
            return "Draw!" +
                    "\n" + thePlayerCard();
        }
        else
            return "Ya broke, bruh!";
    }

    //more info for this function
    public String play(){
        return winLogic() + "\n" + "Computer wins: " + computerWins + " Player wins: " + playerWins;
    }

}
