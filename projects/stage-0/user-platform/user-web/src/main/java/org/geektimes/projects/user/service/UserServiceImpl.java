package org.geektimes.projects.user.service;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.repository.UserRepository;
import org.geektimes.projects.user.sql.DBConnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author daniyar
 * @version 1.0
 * @date 2021/3/3
 */
public class UserServiceImpl implements UserService {

    private static Logger logger = Logger.getLogger(DatabaseUserRepository.class.getName());

    private UserRepository userRepository;

    public UserServiceImpl() {
        try {
            String databaseURL = "jdbc:derby:/db/user-platform;create=true";
            Connection connection = DriverManager.getConnection(databaseURL);
            DBConnectionManager connManager = new DBConnectionManager();
            connManager.setConnection(connection);
            userRepository = new DatabaseUserRepository(connManager);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "创建数据库连接失败", e.getCause());
        }
    }

    @Override
    public boolean register(User user) {
        if (user == null) {
            return false;
        }
        return userRepository.save(user);
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }
}
