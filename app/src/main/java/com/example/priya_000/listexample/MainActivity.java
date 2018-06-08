package com.example.priya_000.listexample;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] foods = {"bacon", "ham", "tuna", "candy", "meatball", "potato"};
        ListAdapter myAdapter = new CustomAdapter(this, foods);
        ListView MyListView = (ListView) findViewById(R.id.MyListView);
        MyListView.setAdapter(myAdapter);

        MyListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                        String food= String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();
                    }

                }
        );
    }
}
