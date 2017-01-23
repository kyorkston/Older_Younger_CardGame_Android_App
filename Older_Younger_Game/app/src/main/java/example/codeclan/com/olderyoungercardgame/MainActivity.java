package example.codeclan.com.olderyoungercardgame;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;

/**
 * Created by user on 20/01/2017.
 */

public class MainActivity extends AppCompatActivity {

    TextView gameRules;
    Button randomCard;
    ImageView playingCardImage;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        gameRules = (TextView)findViewById(R.id.main_text_view);
        randomCard = (Button)findViewById(R.id.random_card_button);
        playingCardImage = (ImageView)findViewById(R.id.main_img);

        Log.d(getClass().toString(), "onCreate made");

    }

    public void onRandomCardButtonPressed(View button){
        Log.d(getClass().toString(), "Random Button Pressed");

        Game game = new Game();

        String theResult = game.play();

        gameRules.setText(theResult);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

}
