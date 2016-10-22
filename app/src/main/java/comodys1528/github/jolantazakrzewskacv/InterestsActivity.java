package comodys1528.github.jolantazakrzewskacv;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class InterestsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        final ImageView fantasyImage = (ImageView) findViewById(R.id.fantasy_image);
        final ImageView cosplayImage = (ImageView) findViewById(R.id.cosplay_image);
        final ImageView developmentImage = (ImageView) findViewById(R.id.development_image);
        final ImageView historyImage = (ImageView) findViewById(R.id.history_image);

        final TextView description = (TextView) findViewById(R.id.description);

        fantasyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                fantasyImage.setAnimation(anim);
                description.setText("here will appear text about FANTASY");
            }
        });

        cosplayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                cosplayImage.setAnimation(anim);
                description.setText("here will appear text about COSPLAY");
            }
        });

        developmentImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                developmentImage.setAnimation(anim);
                description.setText("here will appear text about SELF-DEVELOPMENT");
            }
        });

        historyImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                historyImage.setAnimation(anim);
                description.setText("here will appear text about HISTORY");
            }
        });

    }
}
