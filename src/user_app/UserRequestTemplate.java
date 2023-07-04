package user_app;

import java.util.List;

// interface : une classe dont toutes les méthodes sont abstraites
public interface UserRequestTemplate {
    // Methode abstraite : méthode sans corps.
    // Sert surtout à la specification du code
    // Je décris ce qu'il faut faire, mais pas COMMENT le faire.
    public void insertUser(int id, String name, String email, String password);
    public User selectOneUser(int id);
    public List<User> selectAllUsers();
    public void deleteUser(int id);
    public void updateUser(int id, String newName, String newEmail, String newPassword);
}
