package example.codeclan.com.olderyoungercardgame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static android.R.attr.key;

/**
 * Created by user on 20/01/2017.
 */

public class GameCards {

   private HashMap<String, Integer> cards;

    public GameCards(){
        this.cards = new HashMap<>();

        setUpCards();
    }

    public void setUpCards() {
        cards.put("Stonehenge", 5000);
        cards.put("Colosseum", 2000);
        cards.put("Eiffel Tower", 130);
        cards.put("Hagia Sophia", 1500);
        cards.put("Pyramids", 4500);
        cards.put("Petra", 2300);
        cards.put("Chichen Itza", 1500);
        cards.put("Moai", 700);
        cards.put("Machu Pichu", 500);
        cards.put("Angkor Wat", 800);
        cards.put("Taj Mahal", 370);
    }

    public int getValue(String key){
        int value = cards.get(key);
        return value;
    }

    public String getKey(int value){
        for (String key : cards.keySet()){
            if(cards.get(key) == value){
                return key;
            }
        }
        return null;
    }



}
