package xyz.tmlh.thread.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @Author TianXin
 * @Date 2019年9月10日
 */
public class MyDataSourcePool {
    
    static final String URL = "";
    static final String USER = "";
    static final String PASSWROD = "";
    
    

    public Connection getConnection() {
        try {
            DriverManager.getConnection(URL, USER, PASSWROD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    } 

    public void release() {
        
        
        
        
    }

}
