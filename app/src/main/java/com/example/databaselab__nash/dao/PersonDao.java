package com.example.databaselab__nash.dao;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.databaselab__nash.entity.Person;
import java.util.List;

@Dao
public interface PersonDao {
    @Insert
    void insertPerson(Person person);

    @Query("SELECT * FROM Person")
    List<Person> getAllPersons();
}
