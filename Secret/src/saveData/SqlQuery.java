/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveData;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Sofrosyn
 */
public class SqlQuery {
    public static 
            Connection conn;
//modify saved data
 public static void updateDiary (int id, String date, String title) throws SQLException, ClassNotFoundException {
		// Declare a UPDATE statement
		String stmnt = "UPDATE saveData SET title = '" + title+ "', date = '" + date + "',  where id = '" + id +"'";
		System.out.println("update query inserted");
                // Execute UPDATE operation
		DbConnection.dbExecuteUpdate(stmnt);
	}
 public static void updateMessage (int id, String message) throws SQLException, ClassNotFoundException {
	 // Declare a UPDATE statement
	 String stmnt = "UPDATE saveData SET message = '" + message+ "', where id = '" + id +"'";
	 System.out.println("update query inserted");
	 // Execute UPDATE operation
	 DbConnection.dbExecuteUpdate(stmnt);
 }
              
public static void deleteStaffWithId(int Id) throws SQLException, ClassNotFoundException {
		String stmnt = "DELETE FROM saveData WHERE id = " + Id;
		String stmnt2 = "DELETE FROM file WHERE id = " + Id;

		DbConnection.dbExecuteUpdate(stmnt);
	}
/**
	 * Add new data/ save
	 *
	 * @param date the date
	 * @param data the info from textarea
	 * @param title the title
	
       @throws SQLException the SQL exception
	 * @throws ClassNotFoundException the class not found exception
	 */
	public static void saveSecret(String date, String title) throws SQLException, ClassNotFoundException {
		// Declare a add statement
		String stmnt = "INSERT INTO saveData (date,title)" +
                        "VALUES ('" + date + "','" + title+"')";
                    DbConnection.dbExecuteUpdate(stmnt);
        }
	
	public static void saveMessage(int id, String message) throws SQLException, ClassNotFoundException {
		// Declare a add statement
		String stmnt = "INSERT INTO file (id,message)" +
				"VALUES ('" + message + "','"+ id +"')";
		DbConnection.dbExecuteUpdate(stmnt);
	}
	
/**
	 * Search if title already exist.
	 *
	 * @return the observable list
	 * @throws SQLException the SQL exception
	 * @throws ClassNotFoundException the class not found exception
	 */
	public static ObservableList<Save> searchTitle() throws SQLException, ClassNotFoundException {
		// Declare a SELECT statement
		String selectStmt = "SELECT * FROM saveData";
		// Execute SELECT statement
		// Get ResultSet from dbExecuteQuery method
		ResultSet rsSecrets = DbConnection.dbExecuteQuery(selectStmt);
		// oUse rs for getEmployeeList
		ObservableList<Save> dataList = getDataList(rsSecrets);
		// Return list
		return dataList;
	}

	private static ObservableList<Save> getDataList(ResultSet rs) throws SQLException, ClassNotFoundException {
		// OL to hold Employee
		ObservableList<Save> getDataList = FXCollections.observableArrayList();
		while (rs.next()) {
			Save stf = new Save();
			stf.setid(rs.getInt("id"));
			stf.setDate(rs.getString("date"));
			stf.setTitle(rs.getString("title"));
			stf.setData(rs.getString("data"));
                       
                        
                           // Insert to list
			getDataList.add(stf);
                        System.out.println("getstaff list inserted");
		}
		// Return List
		return getDataList;
	}













}
