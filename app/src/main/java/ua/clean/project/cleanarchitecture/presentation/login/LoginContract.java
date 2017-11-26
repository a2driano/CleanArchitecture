package ua.clean.project.cleanarchitecture.presentation.login;

import ua.clean.project.cleanarchitecture.domain.model.User;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public interface LoginContract {

    interface ILoginView {
        void successRegistration();
    }

    interface ILoginPresenter {
        void registrationUser(User user);

        void callUserPage();
    }
}
