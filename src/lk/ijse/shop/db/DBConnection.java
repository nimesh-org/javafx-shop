/*
 *  ---------------------------------------------------------------------------------------------
 *  Copyright (c) 2021 - present IJSE. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  --------------------------------------------------------------------------------------------
 */

package lk.ijse.shop.db;
/**
 * @author Dinuka Nimesh <nimeshdwejerathna2020@gmail.com>
 * @since {8/7/2021}
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoFx", "root", "udara");
    }


    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        return (null==dBConnection)?
                (dBConnection= new DBConnection()):
                (dBConnection);
    }

    public Connection getConnection(){
        return connection;
    }
}





