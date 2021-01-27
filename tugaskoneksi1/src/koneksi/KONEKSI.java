/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;import com.mysql.jdbc.Driver;
/**
 *
 * @author asus
 */
public class KONEKSI {
            private static Connection Koneksi;
        
            public static Connection
    GetConnection()throws SQLException
    {
        if(Koneksi==null)
        {
            Koneksi=
                DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/tugasdb1","root","");
        }
        return Koneksi;
    }
    
    
    public static Object getConnection(){
        throw new
        UnsupportedOperationException
                ("Not Supported yet.");
    }
}
