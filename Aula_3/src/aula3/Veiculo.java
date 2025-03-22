package aula3;

public class Veiculo {
	String modelo;
	Marca marca;
	String cor;
	double valor;
	double ipva;
	
	void calcIpva() {
		if (ipva <=4000.0) {
			ipva = valor * 2/100;
		} else if (ipva < 7000.0) {
			ipva = valor * 3 / 100;
		} else {
			ipva = valor * 5/100;
		}
	}
}