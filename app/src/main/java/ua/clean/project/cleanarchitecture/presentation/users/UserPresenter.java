package ua.clean.project.cleanarchitecture.presentation.users;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import ua.clean.project.cleanarchitecture.data.model.UserDB;
import ua.clean.project.cleanarchitecture.domain.UserInteractor;
import ua.clean.project.cleanarchitecture.domain.impl.UserInteractorImpl;
import ua.clean.project.cleanarchitecture.domain.model.User;

import static android.content.ContentValues.TAG;
import static ua.clean.project.cleanarchitecture.utils.converter.ConverterUser.convertListDbToUser;

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
        final List<User> userList = new ArrayList<>();
        //Mock for empty result
        userList.add(new User("John", "Doe"));
        userList.add(new User("John", "Doe"));

//        userList.addAll(mUserInteractor.getUsers());

        view.setData(userList);

        mUserInteractor.getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<UserDB>>() {
                    @Override
                    public void accept(List<UserDB> userDBList) throws Exception {
                        userList.addAll(convertListDbToUser(userDBList));
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.e("TAG", "error of receiving data ", throwable);
                    }
                });
    }
}
