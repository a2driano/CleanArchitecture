package ua.clean.project.cleanarchitecture.presentation.presenter.contract;

import ua.clean.project.cleanarchitecture.data.model.User;

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
