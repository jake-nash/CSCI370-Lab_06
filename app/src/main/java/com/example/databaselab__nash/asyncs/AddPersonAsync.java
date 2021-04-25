package com.example.databaselab__nash.asyncs;

import android.os.AsyncTask;
import com.example.databaselab__nash.entity.Person;
import com.example.databaselab__nash.database.*;


public class AddPersonAsync extends AsyncTask<Person, Void, Void> {
    private String name;
    private LabDatabase labDatabase;

    public AddPersonAsync(LabDatabase db) {
        labDatabase = db;
    }

    @Override
    protected Void doInBackground(Person... people) {
        labDatabase.personDao().insertPerson(people[0]);
        return null;
    }
}
