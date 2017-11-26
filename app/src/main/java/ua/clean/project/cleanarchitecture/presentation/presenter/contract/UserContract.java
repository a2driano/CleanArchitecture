package ua.clean.project.cleanarchitecture.presentation.presenter.contract;

import java.util.List;

import ua.clean.project.cleanarchitecture.data.model.User;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public interface UserContract {

    interface IUserView {
        void setData(List<User> list);
    }

    interface IUserPresenter {
        void getData();
    }
}
