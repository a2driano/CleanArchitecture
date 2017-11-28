package ua.clean.project.cleanarchitecture.data.repository.impl;

import java.util.List;

import io.reactivex.Flowable;
import ua.clean.project.cleanarchitecture.App;
import ua.clean.project.cleanarchitecture.data.model.UserDB;
import ua.clean.project.cleanarchitecture.data.persistence.RoomDB;
import ua.clean.project.cleanarchitecture.data.repository.UserRepository;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class UserRepositoryImpl implements UserRepository {
    private RoomDB mDataBase;

    public UserRepositoryImpl() {
        mDataBase = App.getDataBase();
    }

    @Override
    public Flowable<List<UserDB>> getUsers() {
        return mDataBase.getUsers();
    }
}
