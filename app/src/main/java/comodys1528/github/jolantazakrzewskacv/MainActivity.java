package comodys1528.github.jolantazakrzewskacv;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutMe = (Button) findViewById(R.id.about_me);

        aboutMe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), AboutMeActivity.class);
                startActivity(intent);
            }
        });

        Button links = (Button) findViewById(R.id.links);

        links.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), LinksActivity.class);
                startActivity(intent);
            }
        });

        Button activities = (Button) findViewById(R.id.activities);

        activities.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), ActivitiesListActivity.class);
                startActivity(intent);
            }
        });

        Button skills = (Button) findViewById(R.id.skills);

        skills.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), SkillsActivity.class);
                startActivity(intent);
            }
        });

        Button interests = (Button) findViewById(R.id.interests);

        interests.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(getApplicationContext(), InterestsActivity.class);
                startActivity(intent);
            }
        });

        Button phone = (Button) findViewById(R.id.phone_text);

        phone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:728756301");
                Intent it = new Intent(Intent.ACTION_SENDTO, uri);
                startActivity(Intent.createChooser(it, "Send Message"));
            }
        });

        Button mail = (Button) findViewById(R.id.mail_text);

        mail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_EMAIL, "jolanta.zakrzewska@orange.pl");
                startActivity(Intent.createChooser(intent, "Send Email"));
            }
        });
    }

}
