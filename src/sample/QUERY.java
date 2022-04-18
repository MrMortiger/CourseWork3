package sample;

import java.sql.SQLException;
import java.sql.Statement;

public class QUERY extends DatabaseHandler{


    public QUERY() throws SQLException {
        Statement statement = dbConnection.createStatement();
        statement.executeQuery("SELECT * FROM " + Const.CATEGORY_TABLE);
    }

}
