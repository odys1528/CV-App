package comodys1528.github.jolantazakrzewskacv;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class InterestsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interests);

        ImageView image1 = (ImageView) findViewById(R.id.imageView1);
        ImageView image2 = (ImageView) findViewById(R.id.imageView2);
        ImageView image3 = (ImageView) findViewById(R.id.imageView3);
        ImageView image4 = (ImageView) findViewById(R.id.imageView4);

        Picasso.with(this).load(R.drawable.cosplay).resize(100, 100).into(image1);
        Picasso.with(this).load(R.drawable.cosplay).resize(100, 100).into(image2);
        Picasso.with(this).load(R.drawable.cosplay).resize(100, 100).into(image3);
        Picasso.with(this).load(R.drawable.cosplay).resize(100, 100).into(image4);
    }
}
