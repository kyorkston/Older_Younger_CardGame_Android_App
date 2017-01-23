package example.codeclan.com.olderyoungercardgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

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
    TextView hagiasophiaInfo;
    ImageView hagiasophiaImage;
//    TextView angkorwatInfo;
//    ImageView angkorwatImage;
//    TextView moaiInfo;
//    ImageView moaiImage;
//    TextView machupicchuInfo;
//    ImageView machupicchuImage;
//    TextView tajmahalInfo;
//    ImageView tajMahalImage;
//    TextView eiffeltowerInfo;
//    ImageView eiffeltowerImage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.momument_info);

        Log.d(getClass().toString(), "Monument Info onCreate created");

        stonehengeInfo = (TextView)findViewById(R.id.stonehenge_text);
        stonehengeImage = (ImageView)findViewById(R.id.stonehenge_image);
        stonehengeImage.setImageResource(R.drawable.stonehenge_playing);

        pyramidsInfo = (TextView)findViewById(R.id.pyramids_text);
        pyramidsImage = (ImageView)findViewById(R.id.pyramids_image);
        pyramidsImage.setImageResource(R.drawable.pyramids_playing);

        petraInfo = (TextView)findViewById(R.id.petra_text);
        petraImage = (ImageView)findViewById(R.id.petra_image);
        stonehengeImage.setImageResource(R.drawable.petra_playing);

        colosseumInfo = (TextView)findViewById(R.id.colosseum_text);
        colosseumImage = (ImageView)findViewById(R.id.colosseum_image);
        colosseumImage.setImageResource(R.drawable.colosseum_playing);

        hagiasophiaInfo = (TextView)findViewById(R.id.hagia_text);
        hagiasophiaImage = (ImageView)findViewById(R.id.hagia_image);
        hagiasophiaImage.setImageResource(R.drawable.hagia_sophia_playing);
    }

}
