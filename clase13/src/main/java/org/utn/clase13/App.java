package org.utn.clase13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App 
{
    public static void main( String[] args )
    {
       try {
		
    	Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/clase12";
	 	String usuario = "prueba";
	 	String password = "123456";
        int resultado;
	 	
	 	Connection conec = DriverManager.getConnection(url,usuario,password);
   	    Statement consulta= conec.createStatement();
   	    ResultSet rs = consulta.executeQuery("select * from empleados");
         
        System.out.println("EMPLEADOS ACT");	
   	    while (rs.next()) {
       	 
       	 System.out.print(rs.getInt(1) + " "+ rs.getString(2) + " "+ rs.getString(3) + " "+ rs.getString(4) + " "+ rs.getString(5) + "\n");
        
        }
      
   	    try {
			// 3-a AGREGA UN EMPLEADO
			resultado = consulta.executeUpdate(
					"INSERT INTO `empleados`(`dni`, `nombre`, `apellido`, `nacionalidad`, `departamento`) VALUES ('12345677','Juan','Ramon','Colombia','3')");
			System.out.println(resultado + " registros afectados");
		} catch (Exception e) {
			System.out.println("\n" + e.getMessage());
			
		}
		// 3-b MODIFICAR UNA NACIONALIDAD
   		resultado=consulta.executeUpdate("UPDATE `empleados` SET `nacionalidad`='Uruguaya' WHERE empleados.dni = '12345677'");
	    System.out.println("\n" +resultado + " registros actualizados"); 
   	   
	    // 3-c BORRAR UN DEPARTAMENTO
   		resultado=consulta.executeUpdate("DELETE FROM `departamentos` WHERE departamentos.nom_departamento = 'Producción'");
	    System.out.println("\n" +resultado + " registros borrados");
	    
	    // 3-e CONCOER EMPLEADOS DE UN DEPARTAMENTO
	    String depto = "Logistica";
	    String sentSql = "SELECT empleados.dni,empleados.apellido,empleados.nombre FROM empleados INNER JOIN departamentos ON empleados.departamento = departamentos.id_deptartamento WHERE departamentos.nom_departamento = '"+ depto + "'";
	    rs = consulta.executeQuery(sentSql);
	    	    
	    System.out.println("\nEMPLEADOS DEPTO: " + depto);	
   	    while (rs.next()) {
       	 
       	 System.out.print(rs.getInt(1) + " "+ rs.getString(2) + " "+ rs.getString(3) + "\n");
        
        }
	    
   	    // 3-f MOSTRAR LOS DEPTO POR ORDEN
	   
	    sentSql = "SELECT * FROM `departamentos` ORDER BY departamentos.nom_departamento";
	    rs = consulta.executeQuery(sentSql);
	    	    
	    System.out.println("\nDEPARTAMENTOS: " + depto);	
   	    while (rs.next()) {
       	 
       	 System.out.print(rs.getInt(1) + " "+ rs.getString(2) + "\n");
        
        }
	    
	    
	   conec.close();
       }catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
 	   
   
    
    }
}
