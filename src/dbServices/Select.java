/**
 * 
 */
package dbServices;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Kain
 *
 */
public class Select {

	/**
	 * 
	 */
	
	Statement stmt = null;
	ResultSet rs = null;
	Connection conn = null;
	List<String> allInfo = null;
        
	public Select(Connection conn) {
		
		this.conn = conn;
	}

        
        public boolean doSelectAll(String table, String where) throws SQLException{

            boolean success =false;
            String query = "select * from " + table+" " + where;
               
            allInfo = new ArrayList<String>();	
            this.stmt = conn.createStatement();
            this.rs = stmt.executeQuery(query);
            ResultSetMetaData colInfo = rs.getMetaData();

            int colCounter = colInfo.getColumnCount();
            
            while(this.rs.next()){
                StringBuilder string = new StringBuilder();
                for(int i=1;i<colCounter;i++){
                    
                    System.out.println(rs.getString(i));
                    string.append(rs.getString(i));
                    string.append(" ");
                    //allInfo.add(rs.getString(1)+ " " + rs.getString(2));
                    //System.out.println("The Surname : " + rs.getString(2));
                }
                allInfo.add(string.toString());
            }
            return success;

        }
	
	public boolean closeDB(){
		
		boolean success = false;
		
		try {
			
			this.stmt.close();
			this.rs.close();
			this.conn.close();
			success = true;
		} catch (SQLException e) {

			System.out.println("SQL Error : " + e.getMessage());
		}
		
		return success;
		
	}
       public List<String> getAllInfo(){
       
           return this.allInfo;
       }

}