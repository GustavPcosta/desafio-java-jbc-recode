package principal;
import java.sql.Connection;
import java.sql.DriverManager;

	public class Conexao {

	   private static final String USERNAME = "root";
	   private static final String PASSWORD = "88274297A";
	   private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/viagens";

	   public static Connection createConnectionToMySQL() throws Exception {  
	      Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	      return connection;
	   }
	}


