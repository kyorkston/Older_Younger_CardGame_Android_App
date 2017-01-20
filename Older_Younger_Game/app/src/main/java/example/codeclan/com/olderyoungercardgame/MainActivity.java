package example.codeclan.com.olderyoungercardgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.InputStream;

/**
 * Created by user on 20/01/2017.
 */

public class MainActivity extends AppCompatActivity {

    TextView gameRules;
    Button randomCard;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        gameRules = (TextView)findViewById(R.id.main_text_view);
        randomCard = (Button)findViewById(R.id.random_card_button);

        Log.d(getClass().toString(), "onCreate made");
    }

    public void onRandomCardButtonPressed(View button){
        Log.d(getClass().toString(), "Random Button Pressed");

        Game game = new Game();

        String theResult = game.play();

        gameRules.setText(theResult);
    }

}
