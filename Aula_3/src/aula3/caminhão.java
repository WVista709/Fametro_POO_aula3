package aula3;

public class caminhão extends Veiculo {
	double cap_carga;
	
	void calcIpva(){
		if (cap_carga <= 20000.0) {
			ipva = valor * 2/100;
		} else if (cap_carga <= 30000.0) {
			ipva = valor * 3/100;
		} else {
			ipva = valor * 5/100;
		}
	}
}