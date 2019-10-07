package app;

public class OrdenarAlunos {
	private CadastroAlunos source;
	private Aluno resposta[], t;
	private String matricula1, matricula2;
	private int i, j;
	
	public OrdenarAlunos(CadastroAlunos source) {
		this.source = source;
	}
	
	public Aluno[] computar() {
		resposta = new Aluno[source.alunos.length];
		//copia o vetor para o vetor de resposta
		for (i=0; i < source.alunos.length; i++) {
			resposta[i] = source.alunos[i]; 
		}
		
		for (i = 0; i < resposta.length - 1; i++) {
			for (j = i; j < resposta.length; j++) {
				matricula1 = source.formaMatricula(resposta, i);
				matricula2 = source.formaMatricula(resposta, j);
				if (matricula1.compareTo(matricula2) > 0) {
					t = resposta[i]; 
					resposta[i] = resposta[j];
					resposta[j] = t;
				}
			}
		}
		
		return resposta;
	}

}
