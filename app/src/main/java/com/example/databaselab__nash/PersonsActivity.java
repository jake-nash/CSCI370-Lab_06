package com.example.databaselab__nash;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.databaselab__nash.R;

import java.util.ArrayList;


public class PersonsActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        setContentView(R.layout.activity_persons);
        listView = findViewById(R.id.personName);
        ArrayList<String> i = (ArrayList) this.getIntent().getExtras().get("Persons");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, i);
        listView.setAdapter(adapter);
    }
}
