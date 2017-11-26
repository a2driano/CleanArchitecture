package ua.clean.project.cleanarchitecture.presentation.view.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import ua.clean.project.cleanarchitecture.BR;
import ua.clean.project.cleanarchitecture.data.model.User;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class UserViewModel extends BaseObservable {
    private String login;
    private String password;
    private String passwordSecond;
    private boolean valid;
    private User user;

    public UserViewModel() {
        login = "";
        password = "";
        passwordSecond = "";
        valid = false;
        user = new User();
    }

    public UserViewModel(String login, String password, String passwordSecond, boolean valid, User user) {
        this.login = login;
        this.password = password;
        this.passwordSecond = passwordSecond;
        this.valid = valid;
        this.user = user;
    }

    @Bindable
    public User getUser() {
        user.setLogin(login);
        user.setPassword(password);
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Bindable
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
        notifyPropertyChanged(BR.login);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
        setValid(validatePassword());
    }

    @Bindable
    public String getPasswordSecond() {
        return passwordSecond;
    }

    public void setPasswordSecond(String passwordSecond) {
        this.passwordSecond = passwordSecond;
        notifyPropertyChanged(BR.passwordSecond);
        setValid(validatePassword());
    }

    @Bindable
    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
        notifyPropertyChanged(BR.valid);
    }

    public boolean validatePassword() {
        return password.equals(passwordSecond) & !password.isEmpty();
    }
}
