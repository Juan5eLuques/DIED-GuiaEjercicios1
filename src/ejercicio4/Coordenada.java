package ejercicio4;

import java.util.Objects;

public class Coordenada {
	
	public double latitud;
	public double longitud;

	public Coordenada() {
		latitud=0;
		longitud=0;
	}
	
	public Coordenada(double latitud, double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
	}
	
	
	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int hashCode() {
		return Objects.hash(latitud, longitud);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordenada other = (Coordenada) obj;
		return Double.doubleToLongBits(latitud) == Double.doubleToLongBits(other.latitud)
				&& Double.doubleToLongBits(longitud) == Double.doubleToLongBits(other.longitud);
	}
	
	public String toString() {
		return "Latitud: " + latitud + " - Longitud: " + longitud;
	}
	
}
