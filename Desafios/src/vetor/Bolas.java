package vetor;

public class Bolas {
	public static int sequenciaBolasBrancas(boolean[] vetor) {
		int contador = 0;
		int sequenciaMax = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]) {
				contador++;
			} else {
				sequenciaMax = contador;
				contador = 0;
			}
		}
		return sequenciaMax > contador ? sequenciaMax : contador;
	}


}
