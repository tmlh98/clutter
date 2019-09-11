package xyz.tmlh.thread.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * 简易数据库连接池
 */
public class MyDataSourcePool {

    private LinkedList<Connection> pool = new LinkedList<>();

    static final String URL = "";
    static final String USER = "root";
    static final String PASSWROD = "123456";

    static {
        try {
            Class.forName(URL);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public MyDataSourcePool(int size) {
        for (int i = 0; i < size; i++) {
            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWROD);
                pool.add(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection() {
        Connection connection = null;
        synchronized (pool) {
            if(!pool.isEmpty()) {
                connection = pool.poll();
            }else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return connection;
    }

    public void release(Connection connection) {
        synchronized (pool) {
            if(connection != null) {
                pool.addLast(connection);
                notify();
            }
        }
    }

}
