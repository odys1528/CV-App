package comodys1528.github.jolantazakrzewskacv;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LinksActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links);

        TextView linkedin = (TextView) findViewById(R.id.linkedin_text);

        linkedin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String url = getString(R.string.url_linkedin);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        TextView git = (TextView) findViewById(R.id.git_text);

        git.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String url = getString(R.string.url_git);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        TextView club = (TextView) findViewById(R.id.club_text);

        club.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String url = getString(R.string.url_club);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        TextView notld = (TextView) findViewById(R.id.notld_text);

        notld.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String url = getString(R.string.url_notld);
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
