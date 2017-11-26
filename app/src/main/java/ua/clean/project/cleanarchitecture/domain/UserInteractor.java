package ua.clean.project.cleanarchitecture.domain;

import java.util.List;

import ua.clean.project.cleanarchitecture.domain.model.User;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public interface UserInteractor {
    List<User> getUsers();
}
