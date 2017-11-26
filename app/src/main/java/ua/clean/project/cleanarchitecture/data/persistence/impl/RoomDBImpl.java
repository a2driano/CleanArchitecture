package ua.clean.project.cleanarchitecture.data.persistence.impl;

import java.util.List;

import ua.clean.project.cleanarchitecture.data.model.UserDB;
import ua.clean.project.cleanarchitecture.data.persistence.RoomDB;
import ua.clean.project.cleanarchitecture.data.persistence.UserDao;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class RoomDBImpl implements RoomDB {
    private UserDao mUserDao;

    public RoomDBImpl(UserDao userDao) {
        mUserDao = userDao;
    }

    @Override
    public void addUser(UserDB user) {
        mUserDao.addUser(user);
    }

    @Override
    public void delete(UserDB user) {
        mUserDao.delete(user);
    }

    @Override
    public void update(UserDB user) {
        mUserDao.update(user);
    }

    @Override
    public List<UserDB> getUsers() {
        return mUserDao.getUsers();
    }

    @Override
    public UserDB getUser(String login) {
        return mUserDao.getUser(login);
    }
}
