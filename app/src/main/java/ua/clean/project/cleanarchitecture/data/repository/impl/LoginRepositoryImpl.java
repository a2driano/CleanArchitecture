package ua.clean.project.cleanarchitecture.data.repository.impl;


import ua.clean.project.cleanarchitecture.App;
import ua.clean.project.cleanarchitecture.data.model.User;
import ua.clean.project.cleanarchitecture.data.persistence.RoomDB;
import ua.clean.project.cleanarchitecture.data.repository.LoginRepository;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class LoginRepositoryImpl implements LoginRepository {
    private RoomDB mDataBase;

    public LoginRepositoryImpl() {
        mDataBase = App.getDataBase();
    }

    @Override
    public void createUser(User user) {
        mDataBase.addUser(user);
    }
}
