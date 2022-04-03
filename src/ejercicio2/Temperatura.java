package ejercicio2;

public class Temperatura {

	public double grados;
	public Escala escala;
	
	
	public Temperatura() {
		super();
		grados=0;
		escala=Escala.CELCIUS;
	}
	
	public Temperatura(double grad, Escala esc) {
		super();
		grados=grad;
		escala=esc;
	}
	
	public double asCelcius(){
		if (this.escala==Escala.CELCIUS)return this.grados;
		else return ((this.grados-32)*5/9);
	}
	
	public double asFahrenheit(){
		if (this.escala==Escala.FAHRENHEIT)return this.grados;
		else return (this.grados*9/5 + 32);
	}
	
	public String toString() {
		if (this.escala==Escala.CELCIUS)return grados + " C°";
		else return grados + " F°";
	}
	
	
	
	public double getGrados() {
		return grados;
	}

	public void setGrados(double grados) {
		this.grados = grados;
	}

	public void aumentar(Temperatura temperatura) {
		if (temperatura.grados>0) {
			if (this.escala==temperatura.escala) {
				this.grados+=temperatura.grados;
			}
			else {
				if (this.escala==Escala.CELCIUS){
					this.grados+=temperatura.asCelcius();
				}
				else {
					this.grados+=temperatura.asFahrenheit();
				}
			}
		}
	}
	
	public void disminuir(Temperatura temperatura) {
		if (temperatura.grados>0) {
			if (this.escala==temperatura.escala) {
				this.grados-=temperatura.grados;
			}
			else {
				if (this.escala==Escala.CELCIUS){
					this.grados-=temperatura.asCelcius();
				}
				else {
					this.grados-=temperatura.asFahrenheit();
				}
			}
		}
	}
	
}
