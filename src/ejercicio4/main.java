package ejercicio4;

public class main {

	public static void main(String[] args) {
		Camino caminoNuevo= new Camino();
		Coordenada coord=new Coordenada(23,55);
		Coordenada coord2=new Coordenada(5,60);
		caminoNuevo.agregar(coord);
		caminoNuevo.agregar(coord2);
		caminoNuevo.recorrerCamino();
	}

}
