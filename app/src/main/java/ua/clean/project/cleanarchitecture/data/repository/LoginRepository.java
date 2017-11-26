package ua.clean.project.cleanarchitecture.data.repository;

import ua.clean.project.cleanarchitecture.data.model.User;

/**
 * Created by Andrii Papai on 26.11.2017.
 */

public interface LoginRepository {
    void createUser(User user);
}
