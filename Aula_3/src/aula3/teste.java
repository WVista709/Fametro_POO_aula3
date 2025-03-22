package aula3;

import java.util.Scanner;

public class teste {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Veiculo vei = new Veiculo();
		moto M = new moto();
		caminhão cam = new caminhão();
		
		Marca m1 = new Marca("HONDA");
		Marca m2 = new Marca("LUIZ");
		Marca m3 = new Marca("SANTIAGO");
		
		Scanner into =  new Scanner(System.in);

		
		int a, b, c, tipo;
		
		do {
			System.out.println("Escolha o tipo 1: Carro 2: Moto 3: Caminhão");
			tipo = into.nextInt();
			
			if (tipo == 1) {
				System.out.println("Digite o modelo do veiculo: ");
				vei.modelo = into.next();
				System.out.println("Digite a cor do carro: ");
				vei.cor = into.next();
				System.out.println("Digite o valor do carro: ");
				vei.valor = into.nextDouble();
				vei.calcIpva();
				
				System.out.println("Digite a marca 1: " + m1.name + " Marca 2: " + m2.name + " Marca 3: " + m3.name);
				b = into.nextInt();
				
				if (b == 1) {
					vei.marca = m1;
				} else if (b == 2) {
					vei.marca = m2;
				} else if (b == 3) {
					vei.marca = m3;
				}
				
				System.out.println("A modelo: " + vei.modelo + " Valor: " + vei.valor + " IPVA: " + vei.ipva + " Marca: " + vei.marca.name);
			} else if (tipo == 2) {
				System.out.println("Digite o modelo do veiculo: ");
				M.modelo = into.next();
				System.out.println("Digite a cor do carro: ");
				M.cor = into.next();
				System.out.println("Digite o valor do carro: ");
				M.valor = into.nextDouble();
				M.calcIpva();
				System.out.println("Digite as cilindradas: ");
				M.cilindradas = into.nextInt();
						
				System.out.println("Digite a marca 1: " + m1.name + " Marca 2: " + m2.name + " Marca 3: " + m3.name);
				b = into.nextInt();
				
				if (b == 1) {
					M.marca = m1;
				} else if (b == 2) {
					M.marca = m2;
				} else if (b == 3) {
					M.marca = m3;
				}
				
				System.out.println("A modelo: " + M.modelo + " Valor: " + M.valor + " Cilindradas: " + M.cilindradas + " IPVA: " + M.ipva + " Marca: " + M.marca.name);
			} else if (tipo == 3) {
				System.out.println("Digite o modelo do veiculo: ");
				cam.modelo = into.next();
				System.out.println("Digite a cor do carro: ");
				cam.cor = into.next();
				System.out.println("Digite o valor do carro: ");
				cam.valor = into.nextDouble();
				cam.calcIpva();
				System.out.println("Digite a carga: ");
				cam.cap_carga = into.nextDouble();
						
				System.out.println("Digite a marca 1: " + m1.name + " Marca 2: " + m2.name + " Marca 3: " + m3.name);
				b = into.nextInt();
				
				if (b == 1) {
					cam.marca = m1;
				} else if (b == 2) {
					cam.marca = m2;
				} else if (b == 3) {
					cam.marca = m3;
				}
				
				System.out.println("A modelo: " + cam.modelo + " Valor: " + cam.valor + " Capacidade de Carga: " + cam.cap_carga + " IPVA: " + cam.ipva + " Marca: " + cam.marca.name);
			}
			System.out.println("Digite 1 para continuar ou 0 para sair");
			a = into.nextInt();
		} while (a != 0);
	}
}