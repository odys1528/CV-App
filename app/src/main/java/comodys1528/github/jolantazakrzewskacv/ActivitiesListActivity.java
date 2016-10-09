package comodys1528.github.jolantazakrzewskacv;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitiesListActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView activitiesList = (ListView) findViewById(R.id.activity_list);

        final Activities[] activities = { new Activities("Kot", "straszny słodziak"), new Activities("Pies", "hau hau ab"),
                new Activities("Słoń", "beniamin blimsien") };

        ActivitiesAdapter adapter = new ActivitiesAdapter(activities);
        activitiesList.setAdapter(adapter);

        activitiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), ActivitiesItemActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }

    private class Activities {
        private String name;
        private String description;

        public Activities(String name, String description) {
            this.name = name;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private class ActivitiesAdapter extends BaseAdapter {

        private Activities[] activities;

        public ActivitiesAdapter(Activities[] activities) {
            this.activities = activities;
        }

        @Override
        public int getCount() {
            return activities.length;
        }

        @Override
        public Activities getItem(int position) {
            return activities[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.list_item_activities, parent, false);
            }

            TextView activitiesName = (TextView) convertView.findViewById(R.id.activities_name);
            TextView activitiesDescription = (TextView) convertView.findViewById(R.id.activities_description);

            activitiesName.setText(getItem(position).getName());
            activitiesDescription.setText(getItem(position).getDescription());

            return convertView;
        }
    }
}
