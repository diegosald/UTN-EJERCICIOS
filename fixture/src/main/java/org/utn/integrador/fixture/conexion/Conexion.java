package org.utn.integrador.fixture.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.utn.integrador.fixture.config.Config;

 public class Conexion extends Config {
	
	 private String url = this.getDriver();
	 private String usuario = this.getUser();
	 private String password = this.getPass();
	 
	 //	private String url = "jdbc:mysql://localhost:3306/fixture";
// 	private String usuario = "prueba";
// 	private String password = "123456";
 	protected Connection conec;
 	 	
public Conexion()   {
	 
	try {
		Class.forName("com.mysql.jdbc.Driver");
		this.conec = DriverManager.getConnection(url,usuario,password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    	 
 }
 public int guardarDb(String sqlStr) throws SQLException {
	 
	
	 Statement consulta = this.conec.createStatement();
	 return  consulta.executeUpdate(sqlStr);

 } 
   
 public ResultSet consultarDb(String sqlStr) throws SQLException {
	
	Statement consulta = this.conec.createStatement(); 
	return consulta.executeQuery(sqlStr);
	 
 }
    
}
