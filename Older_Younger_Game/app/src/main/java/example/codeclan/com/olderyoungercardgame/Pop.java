package example.codeclan.com.olderyoungercardgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 23/01/2017.
 */
public class Pop extends AppCompatActivity{

    TextView resultText;
    Button playAgain;
    Intent intent;
    Game game;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop_menu);

        Log.d(getClass().toString(), "Higher button initialised");

        resultText = (TextView)findViewById(R.id.result_text);
        playAgain = (Button)findViewById(R.id.replay_button);
        intent = new Intent(Pop.this, MainActivity.class);
        game = new Game();

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("result");

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*0.52), (int)(height*0.33));

        resultText.setText(answer);
    }

    public void onPlayAgainButtonPressed(View button){
        Log.d(getClass().toString(), "Play Again pressed");

        startActivity(intent);
    }
}
