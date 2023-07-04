package user_app;

import java.util.List;

public class UserRequests implements UserRequestTemplate{
    // il faut aussi une connexion à la base de données
    @Override
    public void insertUser(int id, String name, String email, String password) {

    }

    @Override
    public User selectOneUser(int id) {
        return null;
    }

    @Override
    public List<User> selectAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }

    @Override
    public void updateUser(int id, String newName, String newEmail, String newPassword) {

    }
}
