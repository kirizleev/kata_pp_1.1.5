package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl extends UserDaoJDBCImpl implements UserService {
    UserDao user = new UserDaoJDBCImpl();
    public void createUsersTable() throws SQLException {
        user.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        user.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        user.saveUser(name, lastName, age);
        System.out.println("User с именем – " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) throws SQLException {
        user.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return user.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        user.cleanUsersTable();
    }
}
