package ua.clean.project.cleanarchitecture.data.persistence;

import java.util.List;

import io.reactivex.Flowable;
import ua.clean.project.cleanarchitecture.data.model.UserDB;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public interface RoomDB {

    void addUser(UserDB user);

    void delete(ua.clean.project.cleanarchitecture.data.model.UserDB user);

    void update(UserDB user);

    Flowable<List<UserDB>> getUsers();

    UserDB getUser(String login);
}
