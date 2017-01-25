package example.codeclan.com.olderyoungercardgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 20/01/2017.
 */

public class GameTest{

    Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void canGetPlayerCard(){
        assertNotNull(game.thePlayerCard());
    }

    @Test
    public void canGetComputerCard(){
        assertNotNull(game.theComputerCard());
    }

    @Test
    public void canGetPlayerValue(){
        assertNotNull(game.getPlayerCardValue());
    }

    @Test
    public void canGetComputerValue(){
        assertNotNull(game.getComputerCardValue());
    }

}
