package comodys1528.github.jolantazakrzewskacv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.TextView;


public class ActivitiesItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        int item = getIntent().getIntExtra("position", 0);

        TextView name = (TextView) findViewById(R.id.activity_name);
        TextView date = (TextView) findViewById(R.id.activity_date);
        TextView description = (TextView) findViewById(R.id.activity_description);
        CheckBox isCertified = (CheckBox) findViewById(R.id.is_certified_checkBox);

        if (item == 0) {
            name.setText("koteu");
            date.setText("6.10.1996");
            description.setText("so cute");
            isCertified.setChecked(true);
        } else if (item == 1) {
            name.setText("pieseu");
            date.setText("7.10.1996");
            description.setText("so cute");
            isCertified.setChecked(false);
        } else if (item == 2) {
            name.setText("słonieu");
            date.setText("8.10.1996");
            description.setText("so cute");
            isCertified.setChecked(true);
        }


    }
}
