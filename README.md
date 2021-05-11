# Desafio-Java

1.	Foi criado um vetor de valores booleanos que representa a sequência de bolas pretas e brancas retiradas de uma urna, em que true representa uma bola branca e false uma bola preta. Dado esse vetor, foi solicitado que se se crie uma função para descobrir o número máximo de bolas brancas retiradas seguidamente.
A função abaixo foi construída em Java, mas sua lógica possui um erro. Informe qual é esse erro e refatore o código para que funcione corretamente. 

	public int sequenciaBolasBrancas(boolean[] vetor) {
		int contador = 0;
		for(boolean b: vetor) {
			if(b)
				contador++;				
		}
		return contador;
}
