/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasUtama;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Database {

    private static Connection connection;
     public static Connection getConnection() throws SQLException {
          
          if (connection==null){
              String username = "root";
              String password = "";
              String url = "jdbc:mysql://localhost:3306/jv_tugasutama";
              MysqlDataSource source = new MysqlDataSource();
              source.setUser(username);
              source.setPassword(password);
              source.setURL(url);
              connection = source.getConnection();
              System.out.println("berhasil");
        }       
        
        return connection;
      }
}
