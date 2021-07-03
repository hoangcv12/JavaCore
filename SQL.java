/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hoang
 */
public class SQL {
    public static Connection DAO(String database){
        Connection conn=null;
        try {         
            String username="sa";
              String password="123";
            //nạp Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");    
            //tạo chuỗi connection
            String url= ("jdbc:sqlserver://LAPTOP-JR3UEC0Q\\SQLEXPRESS:1433;"+
                    "databasename="+database);
            //connect db
            conn=DriverManager.getConnection(url,username,password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
