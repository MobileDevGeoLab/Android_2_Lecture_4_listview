package ge.geolab.lectures.lecture_04_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<GeoLabStudent> students = new ArrayList<>();
        for(int i = 0; i < Data.names.length; i++){
            GeoLabStudent newStudent = new GeoLabStudent(Data.names[i], Data.surNames[i], Data.images[i]);
            students.add(newStudent);
        }

//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item_layout, Data.names);

        ListView listview = (ListView) findViewById(R.id.listView);

//        listview.setAdapter(arrayAdapter);

        GeolabAdapter adapter = new GeolabAdapter(this, students);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                parent.getAdapter().getItem(position);
            }
        });
    }
}
