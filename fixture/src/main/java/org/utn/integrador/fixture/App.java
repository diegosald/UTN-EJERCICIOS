package org.utn.integrador.fixture;


import java.util.ArrayList;


import org.utn.integrador.fixture.extras.Extras;

public class App {
//TP INTEGRADOR REALIZADO POR SALDAY DIEGO ARIEL PARA EL CURSO ARGENTINA PROGRAMA UTN JAVA INICIAL
	
	public static void main(String[] args) {

		ArrayList<Equipo> equipos = Extras.cargarEquipos();
		ArrayList<Participante> participantes = Extras.cargaParticipante();
		ArrayList<Fase> fases = Extras.cargaFasesDb();
		Extras.cargaRondasDb(fases);
		Extras.cargaPartidosDb(fases, equipos);
		Extras.actResultadosArch(fases, Extras.validaArgs(args));
		Extras.cargaPronoPart(fases, equipos, participantes);

		for (Fase fase : fases) {

			fase.puntosFase(participantes);

		}

	}

}
