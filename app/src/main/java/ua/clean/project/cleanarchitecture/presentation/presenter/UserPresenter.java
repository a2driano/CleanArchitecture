package ua.clean.project.cleanarchitecture.presentation.presenter;

import java.util.ArrayList;
import java.util.List;

import ua.clean.project.cleanarchitecture.data.model.User;
import ua.clean.project.cleanarchitecture.domain.UserInteractor;
import ua.clean.project.cleanarchitecture.domain.impl.UserInteractorImpl;
import ua.clean.project.cleanarchitecture.presentation.presenter.contract.UserContract;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public class UserPresenter implements UserContract.IUserPresenter {
    private UserContract.IUserView view;
    private UserInteractor mUserInteractor;

    public UserPresenter(UserContract.IUserView view) {
        this.view = view;
        mUserInteractor = new UserInteractorImpl();
    }

    @Override
    public void getData() {
        List<User> userList = new ArrayList<>();
        //Mock for empty result
        userList.add(new User("John", "Doe"));
        userList.add(new User("John", "Doe"));

        userList.addAll(mUserInteractor.getUsers());

        view.setData(userList);
    }
}
