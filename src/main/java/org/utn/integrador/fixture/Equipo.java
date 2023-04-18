package org.utn.integrador.fixture;

import java.sql.SQLException;

import org.utn.integrador.fixture.conexion.Conexion;

public class Equipo extends Conexion {

private String id;
private String nombre;
private String descripcion;

    

	public Equipo(String id ,String nombre) {
        this.id = id;
		this.nombre = nombre;
		
	
	}	


	public Equipo(String nombre) {

		this.nombre = nombre;

	
	}	

	public String getid() {

		return this.id;
	}
	
	
	public void guardarEquipo(String sqlStr) throws SQLException {
		
		
		this.guardarDb(sqlStr);
		
	}
	
	
	
}
