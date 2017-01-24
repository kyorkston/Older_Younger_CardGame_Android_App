package example.codeclan.com.olderyoungercardgame;

import java.util.Scanner;

/**
 * Created by user on 20/01/2017.
 */

public class Game {

    private GameCards cards;
    private String player;
    private String computer;
    public int playerWins;
    public int computerWins;

    public Game(){
        this.cards = new GameCards();
        this.player = getRandomCard();
        this.computer = getRandomCard();
        this.playerWins = 0;
        this.computerWins = 0;
    }

    //random card
    public String getRandomCard() {
        return cards.getRandomKeyAndValue();
    }

    // getting card info methods, DRY?
    public String thePlayerCard(){
        return "Your card was " + player + " years old.";
    }

    public int getPlayerCardValue(){
        Scanner scan = new Scanner(player).useDelimiter("[^0-9]+");
        int integer = scan.nextInt();
        return integer;
    }

    public String theComputerCard() {
        return "The computer's card was " + computer + " years old.";
    }

    public int getComputerCardValue(){
        Scanner scan = new Scanner(computer).useDelimiter("[^0-9]+");
        int integer = scan.nextInt();
        return integer;
    }

    public String higherGuess(){
        if (getPlayerCardValue() > getComputerCardValue()){
            playerWins++;
            return "You win! The computer's card was younger." + "\n" + thePlayerCard();
        }
        else if (getPlayerCardValue() == getComputerCardValue()){
            return "Draw! They were both the same age." + "\n" + thePlayerCard();
        }
        else
            computerWins++;
            return "You lose the computer's card was older!" + "\n" + thePlayerCard();
    }

    public String lowerGuess(){
        if (getPlayerCardValue() < getComputerCardValue()){
            playerWins++;
            return "You win! The computer's card was older." + "\n" + thePlayerCard();
        }
        else if (getPlayerCardValue() == getComputerCardValue()){
            return "Draw! They were both the same age." + "\n" + thePlayerCard();
        }
        else
            computerWins++;
            return "You lose! The computer's card was younger." + "\n" + thePlayerCard();
    }

    public String winResults(){
        return "Computer Wins: " + computerWins + " Your Wins: " + playerWins;
    }

}
