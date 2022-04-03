package ejercicio3;

import ejercicio2.Escala;
import ejercicio2.Temperatura;

public class Registro {
	static final int tam_max = 8;
	private String ciudad;
	private Temperatura[] temp;
	private int ultimoRegistro; //Atributo creado para controlar iteraciones del array de Temperaturas// 
	private Temperatura max; //Atributo creado para registrar las temperaturas maximas luego de llamar al metodo "maximo()", posibilitando el registro del retorno de la funcion recursiva.
	
	public Registro(){
		ciudad="-";
		temp=new Temperatura[tam_max];
		ultimoRegistro=0;
	}
	
	public Registro(String city) {
		ciudad=city;
		temp=new Temperatura[tam_max];
		ultimoRegistro=0;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	
	public Temperatura[] getTemp() {
		return temp;
	}


	public void agregar(Temperatura t){
		while (this.ultimoRegistro < this.tam_max) {
			if (this.temp[this.ultimoRegistro]==null) {
			this.temp[this.ultimoRegistro]=t;
			this.ultimoRegistro++;
			this.max=temp[this.ultimoRegistro-1]; //Se le da un valor a max para que no compare con null en el metodo "maximo()", *linea 93*//
			break; 
			}
		}
	}
	
	
	
	public void imprimir() {
		boolean vacio=false; //Simplemente controla si un registro tiene temperaturas inicializadas, para luego hacer una correcta muestra en pantalla//
		
		if(this.temp[0]== null) {
			vacio=true;
			System.out.println("La ciudad " + this.ciudad + " no presenta temperaturas registradas"); 
		}
		if(!vacio) {
			
				System.out.println("TEMPERATURAS REGISTRAS EN : " + this.ciudad);
			for(Temperatura i: temp) {
				System.out.println(i);
			}
		}
	}
	
	
	public float mediaAsCelcius() {
		float promedio=0;
		int contador=0;
		
		for (int i=0;i<this.ultimoRegistro;i++) {
			
			if(this.temp[i].escala==Escala.CELCIUS) {
				promedio +=this.temp[i].getGrados();
				contador++;
			}
		}
		
		return (promedio/contador);
	}
	
	public float mediaAsFahrenheit() {
		float promedio=0;
		int contador=0;
		for (int i=0;i<this.ultimoRegistro;i++) {
			if(this.temp[i].escala==Escala.FAHRENHEIT) {
				promedio +=this.temp[i].getGrados();
				contador++;
			}
		}
		return (promedio/contador);
	}
	
	public Temperatura maximo() {
		if (this.ultimoRegistro==0)return this.max; //Condicion base
		else {
			if(this.temp[ultimoRegistro-1].asCelcius()>this.max.asCelcius()) { // Compara inicialmente la ultima temperatura con si mismo (Inicialmente temp[ultimoRegistro-1] es igual a max *Claramente mejorable*), luego sigue comparando recursivamente (Haciendo una transformacion a CELCIUS) max con la Temperatura anterior, hasta llegar al caso base.
				this.max=this.temp[this.ultimoRegistro-1];					
				this.ultimoRegistro--;
				return (maximo());
			}
			
			else {
				this.ultimoRegistro--;
				return (maximo());
			}
		}
		
	}
	
	
}
