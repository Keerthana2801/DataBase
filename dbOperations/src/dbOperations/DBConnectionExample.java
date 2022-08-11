package dbOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Give db name
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// connect db
		Connection connection=DriverManager.getConnection("jdbc:mysql://root@localhost/selenium_user");
		
Statement statement=connection.createStatement();
ResultSet result=statement.executeQuery("SELECT * FROM super_heros");
while(result.next()) {
	System.out.println(result.getString(1));
}

	}

}
