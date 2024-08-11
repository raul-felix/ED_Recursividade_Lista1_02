package view;

import controller.VetorController;

public class Main {
	
	public static void main(String[] args) {
		
		int[] vetor = { 9, 2, 5, 7, 3, 6, 8 };
		int tamanho = vetor.length;
		VetorController vetorController = new VetorController();
		
		int resultado = vetorController.menorValor(vetor, tamanho, tamanho - 1);
		System.out.println(resultado);
	}

}
