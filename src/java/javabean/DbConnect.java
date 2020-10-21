package javabean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String userName = "root";
	private static String userPwd = "CSD@mysql-1872";
	private static String dbName = "Buy4U";                    
	  
	public static Connection getDBconnection(){
		String  url1="jdbc:mysql://localhost/"+dbName;
		String  url2 ="?user="+userName+"&password="+userPwd;
		String  url3="&useUnicode=true&characterEncoding=GB2312";
		String  url =url1+url2+url3;
		try{
		    Class.forName(driverName);		
		    Connection con=DriverManager.getConnection(url); 
		    return con;		   
	    }catch (Exception e) {			
			   e.printStackTrace();
		}
		return null;
    } 
	   
    public static void closeDB(Connection con,PreparedStatement  pstm, ResultSet rs){
 	   try{
 		   if(rs!=null) rs.close(); 
 		   if(pstm!=null) pstm.close();
		   if(con!=null) con.close();				 
	   }catch (SQLException e) {				
			e.printStackTrace();			
	   }
	}
    
    public static void closeDb(Connection con, ResultSet rs){
    	try{
  		   if(rs!=null) rs.close(); 
 		   if(con!=null) con.close();				 
 	   }catch (SQLException e) {				
 			e.printStackTrace();			
 	   }
    }
    
    public static ResultSet excuteQuery(Connection conn, String sql) {
		ResultSet rs = null;
		try {
				rs = conn.createStatement().executeQuery(sql);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
    
	public static Statement getStatement(Connection conn) {
		Statement stmt = null; 
		try {
			if(conn != null) {
				stmt = conn.createStatement();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	public static ResultSet getResultSet(Statement stmt, String sql) {
		ResultSet rs = null;
		try {
			if(stmt != null) {
				rs = stmt.executeQuery(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
				stmt = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
				rs = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
