package mysqlconnect;

import java.sql.Connection;
import java.sql.ResultSet;

public class MySQLConnect {
    //set MySQL connection parameters
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/bookdb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    //main method for testing
    public static void main(String[] args) {
	    try{
            //connect to Database
            Connection con = getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement stm = con.createStatement();
            String query = "SELECT *FROM book";
            ResultSet rs = stm.executeQuery(query);
            while(rs.next)){
                System.out.println("Book ID: " +rs.getInt(conlumnIndex:1));

            }


        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}