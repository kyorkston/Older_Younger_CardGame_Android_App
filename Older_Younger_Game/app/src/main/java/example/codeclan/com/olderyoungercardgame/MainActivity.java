package example.codeclan.com.olderyoungercardgame;

import android.content.Intent;
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
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        gameRules = (TextView)findViewById(R.id.main_text_view);
        randomCard = (Button)findViewById(R.id.higher_button);

        Log.d(getClass().toString(), "onCreate made");

    }


    public void onRandomCardButtonPressed(View button){
        Log.d(getClass().toString(), "Random Button Pressed");

        intent = new Intent(MainActivity.this, GameActivity.class);

        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

}
