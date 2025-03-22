package aula3_media_do_aluno;

public class aluno {
	String nome;
	double Nota1;
	double Nota2;
	double media;
	String status;
	
	void calculo_media () {
		media = (Nota1 + Nota2) / 2;
		
		if (media >= 5) {
			status = "Aprovado";
		} else {
			status = "reprovado";
		}
	}
}