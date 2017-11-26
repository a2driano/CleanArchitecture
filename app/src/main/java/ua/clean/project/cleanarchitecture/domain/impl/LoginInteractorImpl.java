package ua.clean.project.cleanarchitecture.domain.impl;

import ua.clean.project.cleanarchitecture.data.model.User;
import ua.clean.project.cleanarchitecture.data.repository.LoginRepository;
import ua.clean.project.cleanarchitecture.data.repository.impl.LoginRepositoryImpl;
import ua.clean.project.cleanarchitecture.domain.LoginInteractor;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class LoginInteractorImpl implements LoginInteractor {
    private LoginRepository mLoginRepository;

    public LoginInteractorImpl() {
        mLoginRepository = new LoginRepositoryImpl();
    }

    @Override
    public void createUser(User user) {
        mLoginRepository.createUser(user);
    }
}
