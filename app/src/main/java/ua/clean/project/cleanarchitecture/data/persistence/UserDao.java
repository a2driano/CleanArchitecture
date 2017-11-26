package ua.clean.project.cleanarchitecture.data.persistence;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import ua.clean.project.cleanarchitecture.data.model.User;

import static ua.clean.project.cleanarchitecture.Constants.Persistence.TABLE_NAME;


/**
 * Created by Andrii Papai on 26.11.2017.
 */
@Dao
public interface UserDao {
    @Insert(onConflict = OnConflictStrategy.ROLLBACK)
    void addUser(User user);

    @Delete
    void delete(User user);

    @Update
    void update(User user);

    @Query("SELECT * FROM " + TABLE_NAME)
    List<User> getUsers();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE login LIKE :login")
    User getUser(String login);
}