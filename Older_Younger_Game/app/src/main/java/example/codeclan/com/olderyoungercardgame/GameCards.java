package example.codeclan.com.olderyoungercardgame;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by user on 20/01/2017.
 */

public class GameCards {

   private HashMap<String, Integer> cards;

    public GameCards(){
        this.cards = new HashMap<>();
        setUpCards();
    }

    private void setUpCards() {
        cards.put("Stonehenge", 5000);
        cards.put("Colosseum", 2000);
        cards.put("Eiffel Tower", 130);
        cards.put("Hagia Sophia", 1500);
        cards.put("Pyramids", 4500);
        cards.put("Petra", 2300);
        cards.put("Moai", 700);
        cards.put("Machu Pichu", 500);
        cards.put("Angkor Wat", 800);
        cards.put("Taj Mahal", 370);
    }

    public int getValue(String key){
        return cards.get(key);
    }

    public String getKey(int value){
        for (String key : cards.keySet()){
            if(cards.get(key) == value){
                return key;
            }
        }
        return null;
    }

    public int numberOfCards(){
        return cards.size();
    }

    public String getRandomKeyAndValue(){
        Object[] arrayOfHash = cards.keySet().toArray();
        Object result =  arrayOfHash[new Random().nextInt(arrayOfHash.length)];
        int value = getValue(result.toString());
        return result.toString() + " " + value;
    }

}
