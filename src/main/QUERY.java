package main;

import model.Product;
import Configs.Const;
import Configs.DatabaseHandler;
import model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Query extends DatabaseHandler {
    public void QuerySelect() throws SQLException, ClassNotFoundException {

        /*Statement statement = getDbConnection().createStatement();

        String sqlString =
                "SELECT " + Const.CUSTOMERS_CONTACT_NAME +
                        " FROM " + Const.CUSTOMERS_TABLE;
        //statement.executeQuery sqlString;
        ResultSet rs = statement.executeQuery(sqlString);
        while (rs.next()){
            String name = rs.getString(2);
            System.out.println(name);
        }
*/
    }

}
