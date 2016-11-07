import java.sql.*;
public class JDBCConnection {
	public static void main(String args[]){
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
	    PreparedStatement ps=con.prepareStatement("Select * from dual");
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()){
	    	System.out.println(rs.getString(1));
	    }
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}