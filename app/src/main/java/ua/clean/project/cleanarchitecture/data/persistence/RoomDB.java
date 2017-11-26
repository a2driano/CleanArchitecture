package ua.clean.project.cleanarchitecture.data.persistence;

import java.util.List;

import ua.clean.project.cleanarchitecture.data.model.User;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public interface RoomDB {

    void addUser(User user);

    void delete(User user);

    void update(User user);

    List<User> getUsers();

    User getUser(String login);
}
