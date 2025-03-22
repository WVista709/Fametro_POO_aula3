package aula3_media_do_aluno;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		pos af = new pos();
		
		Scanner into = new Scanner(System.in);
		
		af.nome = "Jõao";
		af.Nota1 = 3.0;
		af.Nota2 = 5.0;
		af.Nota3 = 1.0;
		af.Nota4 = 5.0;
		
		System.out.println("O aluno publicou artigo?" + "Deseja utilizar a media pela nota ou pelo artigo?,  Digite 1 para o artigo ou 0 para nota: ");
		int a = into.nextInt();
		
		if (a == 1) {
			af.calculo_media(a);
		} else if (a == 0) {
			af.calculo_media();
		}
		
		System.out.println("Nome: " + af.nome);
		System.out.println("Media: " + af.media);
		System.out.println("Status: " + af.status);
	}
}