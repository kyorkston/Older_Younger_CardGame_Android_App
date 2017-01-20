package example.codeclan.com.olderyoungercardgame;

import android.content.Intent;

import java.util.Scanner;

/**
 * Created by user on 20/01/2017.
 */

public class Game {

    private GameCards cards;
    private String player;
    private String computer;

    public Game(){
        this.cards = new GameCards();
        this.player = getRandomCard();
        this.computer = getRandomCard();
    }

    //random card
    public String getRandomCard() {
        return cards.getRandomKeyAndValue();
    }

    public String thePlayerCard(){
        return "Your card was " + player;
    }
//
    public int getPlayerCardValue(){
        Scanner scan = new Scanner(player).useDelimiter("[^0-9]+");
        int integer = scan.nextInt();
        return integer;
    }
//
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
            return "You lose, the computer's card was older!" + "\n" + thePlayerCard() + "\n" + theComputerCard();
        } else if (getPlayerCardValue() > getComputerCardValue()) {
            return "You win, you're card was older!" + "\n" + thePlayerCard() + "\n" + theComputerCard();
        } else if (getPlayerCardValue() == getComputerCardValue()){
            return "Draw!" + "\n" + thePlayerCard() + "\n" + theComputerCard();
        } else
            return "Ya broke, bruh!";
    }

    public String play(){

        return "\n" + player + "\n" + computer;
    }


}
