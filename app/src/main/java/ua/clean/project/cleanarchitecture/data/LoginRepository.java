package ua.clean.project.cleanarchitecture.data;

import ua.clean.project.cleanarchitecture.data.model.User;

/**
 * Created by kunde on 22.11.2017.
 */

public interface LoginRepository {
    
    void loginUser(User User);

    boolean checkUserAuthority();
}
