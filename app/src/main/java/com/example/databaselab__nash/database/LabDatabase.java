package com.example.databaselab__nash.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.databaselab__nash.dao.PersonDao;
import com.example.databaselab__nash.entity.Person;


@Database(entities = {Person.class}, version = 1)
public abstract class LabDatabase extends RoomDatabase {

    public abstract PersonDao personDao();
}