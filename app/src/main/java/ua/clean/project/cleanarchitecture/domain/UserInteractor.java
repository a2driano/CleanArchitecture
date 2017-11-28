package ua.clean.project.cleanarchitecture.domain;

import java.util.List;

import io.reactivex.Flowable;
import ua.clean.project.cleanarchitecture.data.model.UserDB;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public interface UserInteractor {
    Flowable<List<UserDB>> getUsers();
}
