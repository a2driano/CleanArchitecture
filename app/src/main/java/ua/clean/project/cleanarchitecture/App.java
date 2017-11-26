package ua.clean.project.cleanarchitecture;

import android.app.Application;

import ua.clean.project.cleanarchitecture.data.persistence.RoomDB;
import ua.clean.project.cleanarchitecture.data.persistence.impl.RoomDBImpl;
import ua.clean.project.cleanarchitecture.data.persistence.UserDB;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class App extends Application {
    private static RoomDB mDataBase;

    @Override
    public void onCreate() {
        super.onCreate();

        initDB();
    }

    private void initDB() {
        UserDB userDB = UserDB.getInstance(this);
        mDataBase = new RoomDBImpl(userDB.userDao());
    }

    public static RoomDB getDataBase() {
        return mDataBase;
    }
}
