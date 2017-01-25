package example.codeclan.com.olderyoungercardgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by user on 23/01/2017.
 */

public class MonumentInfoActivity  extends AppCompatActivity{

    TextView stonehengeInfo;
    ImageView stonehengeImage;
    TextView pyramidsInfo;
    ImageView pyramidsImage;
    TextView petraInfo;
    ImageView petraImage;
    TextView colosseumInfo;
    ImageView colosseumImage;
    TextView brochInfo;
    ImageView brochImage;
    TextView hagiasophiaInfo;
    ImageView hagiasophiaImage;
    TextView angkorwatInfo;
    ImageView angkorwatImage;
    TextView moaiInfo;
    ImageView moaiImage;
    TextView machupicchuInfo;
    ImageView machupicchuImage;
    TextView tajmahalInfo;
    ImageView tajMahalImage;
    TextView eiffeltowerInfo;
    ImageView eiffeltowerImage;
    Intent intent;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.monument_info);

        Log.d(getClass().toString(), "Monument Info onCreate created");

        stonehengeInfo = (TextView)findViewById(R.id.stonehenge_text);
        stonehengeImage = (ImageView)findViewById(R.id.stonehenge_image);
        stonehengeImage.setImageResource(R.drawable.stonehenge_playing);

        pyramidsInfo = (TextView)findViewById(R.id.pyramids_text);
        pyramidsImage = (ImageView)findViewById(R.id.pyramids_image);
        pyramidsImage.setImageResource(R.drawable.pyramids_playing);

        petraInfo = (TextView)findViewById(R.id.petra_text);
        petraImage = (ImageView)findViewById(R.id.petra_image);
        petraImage.setImageResource(R.drawable.petra_playing);

        colosseumInfo = (TextView)findViewById(R.id.colosseum_text);
        colosseumImage = (ImageView)findViewById(R.id.colosseum_image);
        colosseumImage.setImageResource(R.drawable.colosseum_playing);

        brochInfo = (TextView)findViewById(R.id.broch_text);
        brochImage = (ImageView)findViewById(R.id.broch_image);
        brochImage.setImageResource(R.drawable.broch_playing);

        hagiasophiaInfo = (TextView)findViewById(R.id.hagia_text);
        hagiasophiaImage = (ImageView)findViewById(R.id.hagia_image);
        hagiasophiaImage.setImageResource(R.drawable.hagia_sophia_playing);

        angkorwatInfo = (TextView)findViewById(R.id.angkor_text);
        angkorwatImage = (ImageView)findViewById(R.id.angkor_image);
        angkorwatImage.setImageResource(R.drawable.angkor_wat_playing);

        moaiInfo = (TextView)findViewById(R.id.moai_text);
        moaiImage = (ImageView)findViewById(R.id.moai_image);
        moaiImage.setImageResource(R.drawable.moai_playing);

        machupicchuInfo = (TextView)findViewById(R.id.machu_text);
        machupicchuImage = (ImageView)findViewById(R.id.machu_image);
        machupicchuImage.setImageResource(R.drawable.machu_picchu_playing);

        tajmahalInfo = (TextView)findViewById(R.id.mahal_text);
        tajMahalImage = (ImageView)findViewById(R.id.mahal_image);
        tajMahalImage.setImageResource(R.drawable.taj_mahal_playing);

        eiffeltowerInfo = (TextView)findViewById(R.id.eiffel_text);
        eiffeltowerImage = (ImageView)findViewById(R.id.eiffel_image);
        eiffeltowerImage.setImageResource(R.drawable.eiffel_playing);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.home){
            Log.d(getClass().toString(), "Home Button selected");

            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
