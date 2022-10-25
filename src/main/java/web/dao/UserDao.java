package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> allUser();

    User getUserById(int id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int id);

}
