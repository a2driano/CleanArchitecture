package ua.clean.project.cleanarchitecture.domain.impl;

import java.util.List;

import ua.clean.project.cleanarchitecture.data.model.UserDB;
import ua.clean.project.cleanarchitecture.data.repository.UserRepository;
import ua.clean.project.cleanarchitecture.data.repository.impl.UserRepositoryImpl;
import ua.clean.project.cleanarchitecture.domain.UserInteractor;
import ua.clean.project.cleanarchitecture.domain.model.User;

import static ua.clean.project.cleanarchitecture.utils.converter.ConverterUser.convertListDbToUser;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class UserInteractorImpl implements UserInteractor {
    private UserRepository mUserRepository;

    public UserInteractorImpl() {
        mUserRepository = new UserRepositoryImpl();
    }

    @Override
    public List<User> getUsers() {
        return convertListDbToUser(mUserRepository.getUsers());
    }
}
