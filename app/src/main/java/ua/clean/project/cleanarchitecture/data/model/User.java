package ua.clean.project.cleanarchitecture.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.support.annotation.NonNull;

import static ua.clean.project.cleanarchitecture.Constants.Persistence.TABLE_NAME;

/**
 * Created by a2driano on 22.11.2017.
 */
@Entity(tableName = TABLE_NAME)
public class User extends BaseObservable {
    @PrimaryKey
    @NonNull
    private String login;
    private String password;

    public User() {

    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Bindable
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
