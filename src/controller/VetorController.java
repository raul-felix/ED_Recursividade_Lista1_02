package controller;

public class VetorController {
	
	public VetorController() {
		super();
	}
	
	public int menorValor(int[] vet, int tamanho, int menor) {
		
		int ultimoValor = vet[tamanho - 1];
		if (ultimoValor < menor) {
			menor = ultimoValor;
		}
		
		if (tamanho <= 1) {
			// se o tamanho for igual a 1, chegamos na primeira posição do vetor e retornamos o menor valor encontrado
			return menor;
		} else {
			// se não, retornamos a função recursiva com o tamanho do vetor subtraído por 1
			return menorValor(vet, tamanho - 1, menor);
		}
	}

}
