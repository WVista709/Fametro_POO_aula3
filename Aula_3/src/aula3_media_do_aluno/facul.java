package aula3_media_do_aluno;

public class facul extends aluno{
	double Nota3;
	
	void calculo_media () {
		media = (Nota1 + Nota2 + Nota3)/3;
		
		if (media >= 6) {
			status = "Aprovado";
		} else if (media >= 4 && media < 6) {
			status = "Em exame";
		} else {
			status = "Reprovado";
		}
	}
}