package ua.clean.project.cleanarchitecture.presentation.presenter;


import ua.clean.project.cleanarchitecture.data.model.User;
import ua.clean.project.cleanarchitecture.domain.LoginInteractor;
import ua.clean.project.cleanarchitecture.domain.impl.LoginInteractorImpl;
import ua.clean.project.cleanarchitecture.presentation.presenter.contract.LoginContract;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class LoginPresenter implements LoginContract.ILoginPresenter {
    private LoginContract.ILoginView view;
    private LoginInteractor mLoginInteractor;

    public LoginPresenter(LoginContract.ILoginView view) {
        this.view = view;
        mLoginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void registrationUser(User user) {
        mLoginInteractor.createUser(user);

        view.successRegistration();
    }

    @Override
    public void callUserPage() {
        view.successRegistration();
    }
}
