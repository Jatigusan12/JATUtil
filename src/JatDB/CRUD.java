package JatDB;



import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUD {
    
    public Connection connectToDB() throws  ClassNotFoundException, SQLException {
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl= "jdbc:mysql://localhost/adrian";
        Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl,"root","");
        return conn;
    }
    
    public boolean addData(String sqlString){
        System.out.println(sqlString);
        try{
        Connection conn = connectToDB();
        Statement st= conn.createStatement();
        st.executeUpdate(sqlString);
        conn.close();
        return true;
        } catch (Exception e) {
            System.err.println("Got an Exception!");
            System.err.println(e.getMessage());
            return false;
        }       
    }
}
