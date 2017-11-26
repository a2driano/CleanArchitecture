package ua.clean.project.cleanarchitecture.data.repository;

import ua.clean.project.cleanarchitecture.data.model.UserDB;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public interface LoginRepository {
    void createUser(UserDB user);
}
