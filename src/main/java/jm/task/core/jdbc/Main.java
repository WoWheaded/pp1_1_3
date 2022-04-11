package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("Alex", "Petrov", (byte) 10);
        userDao.saveUser("Michel", "Shumackher", (byte) 11);
        userDao.saveUser("Alina", "Kabaeva", (byte) 12);
        userDao.saveUser("Dmitry", "Axonskiy", (byte) 13);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}