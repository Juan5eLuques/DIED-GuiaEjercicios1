package ejercicio4;

import java.util.ArrayList;

public class Camino {

	ArrayList camino=new ArrayList(); //Unico atributo de la clase //
	
	
	//Metods//
	
	
	public void agregar(Coordenada x) {
		camino.add(x);
	}
	
	public void agregar(double lat,double ing) {
		Coordenada nuevaCoordenada=new Coordenada(lat,ing);
	}
	
	public void agregar(int mtsLt, int mtsLn) {
		double earth = 6378.137; //radius of the earth in kilometer
		double pi = Math.PI;
		double m = (1 / ((2 * pi / 360) * earth)) / 1000;  //1 meter in degree
		Coordenada nuevaCoordenada=new Coordenada();
	}
	
	public void recorrerCamino() {
		System.out.println("Puntos del camino : ");
		for (int i=0;i<camino.size();i++) {
			System.out.println("\nPunto " + i + ": ");
			System.out.println(camino.get(i));
		}
	}
	
}