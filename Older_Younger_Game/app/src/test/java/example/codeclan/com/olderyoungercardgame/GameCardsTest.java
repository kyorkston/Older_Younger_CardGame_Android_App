package example.codeclan.com.olderyoungercardgame;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 20/01/2017.
 */

public class GameCardsTest {

    GameCards cards;

    public GameCardsTest(){
        cards = new GameCards();
    }

    @Test
    public void canGetCardAtIndex(){
        assertEquals(5000, cards.getValue("Stonehenge"));
    }

    @Test
    public void canGetCardAtKey(){
        assertEquals("Stonehenge", cards.getKey(5000));
    }

}
