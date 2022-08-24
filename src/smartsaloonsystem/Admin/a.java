import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
public class a
{
	public static void main(String args[])
	{
		String url = "jdbc:mydql://localhost:3306/smartsaloon";
		String username = "root";
		String password = "";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url,username,password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from user");
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+resultSet.getString(3));
			}
			connection.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}