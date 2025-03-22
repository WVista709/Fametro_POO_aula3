package aula3_media_do_aluno;

public class pos extends facul {
	double Nota4;
	double Artigo = 0.0;
	
	void calculo_media () {
		media = (Nota1 + Nota2 + Nota3 + Nota4)/4;
		
		if (media >= 6) {
			status = "Aprovado";
		} else if (media >= 4 && media < 6) {
			status = "Em exame";
		} else {
			status = "Reprovado";
		}
	}
	
	void calculo_media (int a) {
		Artigo = 10.0;
		status = "Aprovado";
	}
}