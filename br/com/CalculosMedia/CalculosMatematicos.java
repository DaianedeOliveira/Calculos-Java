package br.com.CalculosMedia;

public class CalculosMatematicos {

	public static void main(String[] args) {

		// Media
		double mediaPao = 12.99;
		double mediaIogurte = 5.89;
		double media = mediaPao + mediaIogurte / 2;
		System.out.println("A média é R$:" + "" + Math.floor(media));

		// soma
		int somaLivros = 80;
		int somaBorrachas = 5;
		int somaCadernos = 60;
		int somaCanetas = 10;
		int soma = somaLivros + somaBorrachas + somaCadernos + somaCanetas;
		System.out.println("O valor total é R$" + soma);

		// subtração
		double subCaderno = 20.99;
		double subCanetas = 10.59;
		double subMochila = 80.00;
		double subMarcaTextos = 10.99;
		double sub = subCaderno - subCanetas;
		System.out.println("O valor será: R$" + "" + Math.floor(sub));

		// Divisão com alguns dados utilizados acima
		double divisao = subMochila / subMarcaTextos;
		System.out.println("O resultado da divisão é:" + Math.floor(divisao));

	}

}
