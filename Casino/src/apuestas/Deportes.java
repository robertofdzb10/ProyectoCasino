package apuestas;

/**
 * Deportes un tipo de apuesta donde habra multiples posibilidades de apuesta
 */
public class Deportes extends Apuestas{

public void partidos() {

	Equipo Equipo1 = new Equipo("Leicester",0);
	Equipo Equipo2 = new Equipo("ManUnited",0);
	Equipo Equipo3 = new Equipo("AstonVilla",0);
	Equipo Equipo4 = new Equipo("CrystalPalace",0);
	Equipo Equipo5 = new Equipo("ManCity",0);
	Equipo Equipo6 = new Equipo("Newcastle",0);
	
	Partido partido1 = new Partido(Equipo1,Equipo2,null,"13:30","2020-12-26",2,(float)2.2,3,String.valueOf(Equipo1.getGoles()) + "-" + String.valueOf(Equipo2.getGoles()));
	Partido partido2 = new Partido(Equipo3,Equipo4,null,"16:00","2020-12-26",(float)1.7,(float)2.45,(float)2.3,String.valueOf(Equipo3.getGoles()) + "-" + String.valueOf(Equipo4.getGoles()));
	Partido partido3 = new Partido(Equipo5,Equipo6,null,"21:00","2020-12-26",(float)1.3,(float)2.6,(float)2.5,String.valueOf(Equipo5.getGoles()) + "-" + String.valueOf(Equipo6.getGoles()));
}

	
}
