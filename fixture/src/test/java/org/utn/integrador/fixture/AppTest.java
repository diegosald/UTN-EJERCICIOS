package org.utn.integrador.fixture;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testResultadoEnum()
    {
        Equipo equipo1 = new Equipo("ARG");
        Equipo equipo2 = new Equipo("BRA");
    	Partido partidotest = new Partido(0,0,equipo1,equipo2,2,1);
    	ResultadoEnum resEnumEsp = ResultadoEnum.GANO;
    	
    	partidotest.resultado(equipo2);
    
   assertEquals(resEnumEsp,partidotest.resultado(equipo1)); 	
    	
    	
    }
    
    @Test
    public void testPronosticoResultadoPuntos()
    {
        Equipo equipo1 = new Equipo("ARG");
        Equipo equipo2 = new Equipo("BRA");
    	Partido partidoTest = new Partido(0,0,equipo1,equipo2,2,1);
    	Participante participanteTest = new Participante(1,"Persona1");
    	Pronostico pronosticoTest = new Pronostico(0,0,partidoTest,equipo1,ResultadoEnum.GANO);
    	System.out.println( pronosticoTest.puntos());
        int puntoEsperado= Integer.parseInt(pronosticoTest.getPuntosacertado());
   
        assertEquals(puntoEsperado,pronosticoTest.puntos()); 	
    	
    	
    }

    

}
