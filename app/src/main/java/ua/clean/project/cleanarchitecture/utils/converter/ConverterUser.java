package ua.clean.project.cleanarchitecture.utils.converter;

import java.util.ArrayList;
import java.util.List;

import ua.clean.project.cleanarchitecture.data.model.UserDB;
import ua.clean.project.cleanarchitecture.domain.model.User;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class ConverterUser {

    public static User convertDbToUser(UserDB userDB) {
        User user = new User();
        user.setLogin(userDB.getLogin());
        user.setPassword(userDB.getPassword());

        return user;
    }

    public static List<User> convertListDbToUser(List<UserDB> userDBList) {
        List<User> userList = new ArrayList<>();
        for (UserDB userDB : userDBList) {
            userList.add(convertDbToUser(userDB));
        }

        return userList;
    }

    public static UserDB convertUserToUserDB(User user) {
        UserDB userDB = new UserDB();
        userDB.setLogin(user.getLogin());
        userDB.setPassword(user.getPassword());

        return userDB;
    }

    public static List<UserDB> convertListUserToUserDB(List<User> userList) {
        List<UserDB> userDBList = new ArrayList<>();
        for (User user : userList) {
            userDBList.add(convertUserToUserDB(user));
        }

        return userDBList;
    }

}
