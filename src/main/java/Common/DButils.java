package Common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class DButils { 
	 
		private static Connection connection;
		private static Statement statement;

		static { 
			try {
				connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/ecommerse " , " root", "Sia@0120");
				statement = (Statement) connection.createStatement();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public static ResultSet executeSelectQuery(String query) throws SQLException { // Select query
			ResultSet result = ((java.sql.Statement) statement).executeQuery(query);

			return result;
		}

		public static void executeQuery(String query) throws Exception { // Insert, Update, Delete, Create, Drop, //
																			// truncate
			statement.execute();
		}

	}









