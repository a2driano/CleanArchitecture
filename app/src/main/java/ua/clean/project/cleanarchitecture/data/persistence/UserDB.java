package ua.clean.project.cleanarchitecture.data.persistence;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import ua.clean.project.cleanarchitecture.data.model.User;

import static ua.clean.project.cleanarchitecture.Constants.Persistence.DB_NAME;
import static ua.clean.project.cleanarchitecture.Constants.Persistence.DB_VERSION;

/**
 * Created by Andrii Papai on 26.11.2017.
 */
@Database(entities = User.class, version = DB_VERSION)
public abstract class UserDB extends RoomDatabase {

    private static volatile UserDB INSTANCE;

    public abstract UserDao userDao();

    public static UserDB getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (UserDB.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context,
//                            UserDB.class, DB_NAME).build();
                            UserDB.class, DB_NAME).allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }
}
