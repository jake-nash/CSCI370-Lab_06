package com.example.databaselab__nash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.databaselab__nash.database.LabDatabase;
import com.example.databaselab__nash.asyncs.*;
import com.example.databaselab__nash.dao.PersonDao;
import com.example.databaselab__nash.entity.*;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private LabDatabase labDB;
    private EditText editText;
    private Button addNameButton;
    private Button getNamesButton;

    public static ArrayList<Person> people;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        addNameButton = findViewById(R.id.add_person_button);
        getNamesButton = findViewById(R.id.get_all_persons_button);

        labDB = Room.databaseBuilder(this, LabDatabase.class, "Database 1").build();

        addNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AddPersonAsync addPersonAsync = new AddPersonAsync(labDB);
                Person person = new Person();
                person.setName(editText.getText().toString());
                addPersonAsync.execute(person);
                editText.setText("");
            }
        });

        getNamesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final GetAllPersonsAsync getAllPersonsAsync = new GetAllPersonsAsync(labDB, getApplicationContext());
                getAllPersonsAsync.execute();
            }
        });
    }
}