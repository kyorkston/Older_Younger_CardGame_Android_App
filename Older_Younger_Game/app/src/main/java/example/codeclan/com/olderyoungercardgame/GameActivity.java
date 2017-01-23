package example.codeclan.com.olderyoungercardgame;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by user on 23/01/2017.
 */

public class GameActivity extends AppCompatActivity{

    Button randomCard;
    ImageView playingCardImage;
    Game game;
    Intent intent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.game_activity);

        playingCardImage = (ImageView)findViewById(R.id.main_img);
        randomCard = (Button)findViewById(R.id.random_card_button);

    }


    public void onHigherButtonPressed(View button){
        Log.d(getClass().toString(), "Higher button pressed");

        intent = new Intent(GameActivity.this, Pop.class);

        String result = game.play();

        intent.putExtra("result", result);
        startActivity(intent);


        if (game.theComputerCard().contains("Stonehenge")){
            playingCardImage.setImageResource(R.drawable.stonehenge_playing);
        }
        else if (game.theComputerCard().contains("Taj")){
            playingCardImage.setImageResource(R.drawable.taj_mahal_playing);
        }
        else if (game.theComputerCard().contains("seum")){
            playingCardImage.setImageResource(R.drawable.colosseum_playing);
        }
        else if (game.theComputerCard().contains("Eiffel")){
            playingCardImage.setImageResource(R.drawable.eiffel_playing);
        }
        else if (game.theComputerCard().contains("Hagia")){
            playingCardImage.setImageResource(R.drawable.hagia_sophia_playing);
        }
        else if (game.theComputerCard().contains("Pyramids")){
            playingCardImage.setImageResource(R.drawable.pyramids_playing);
        }
        else if (game.theComputerCard().contains("Petra")){
            playingCardImage.setImageResource(R.drawable.petra_playing);
        }
        else if (game.theComputerCard().contains("Moai")){
            playingCardImage.setImageResource(R.drawable.moai_playing);
        }
        else if (game.theComputerCard().contains("Machu")) {
            playingCardImage.setImageResource(R.drawable.machu_picchu_playing);
        }
        else if (game.theComputerCard().contains("Angkor")) {
            playingCardImage.setImageResource(R.drawable.angkor_wat_playing);
        }

    }




}
