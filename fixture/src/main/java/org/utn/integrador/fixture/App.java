package org.utn.integrador.fixture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.utn.integrador.fixture.conexion.Conexion;
import org.utn.integrador.fixture.extras.Extras;

public class App {
	public static void main(String[] args) {
		Conexion con = new Conexion();
		ResultSet aux;
		ArrayList<Equipo> equipos = Extras.cargarEquipos();
		ArrayList<Participante> participantes = Extras.cargaParticipante();
		ArrayList<Fase> fases = Extras.cargaFasesDb();
		Extras.cargaRondasDb(fases);
		Extras.cargaPartidosDb(fases, equipos);
		
		Extras.actResultadosArch(fases, Extras.validaArgs(args));
		 
		// ArrayList<Fase> fases = Extras.CargaFases(equipos) ;
		Extras.cargaPronoPart(fases, equipos, participantes);

		for (Fase fase : fases) {

			fase.puntosFase(participantes);

		}

	}

}
