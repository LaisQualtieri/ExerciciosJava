package br.com.exemplo.java;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Lais";

		String sobrenome = "Qualtieri";

		Integer dinheiro = 45;

		Integer gastei = 78;

		if ("Allan".equals(nome) && gastei < dinheiro) {

			String valorConta = nome + " " + sobrenome + " valor de troco: R$" + (dinheiro - gastei) + ",00";

			System.out.println(valorConta);
		} else if ("Lais".equals(nome) && dinheiro >= 77) {

			System.out.println("Faltou: R$" + (dinheiro - gastei) + ",00 por favor me traga na proxima");

		} else {

			System.out.println(" joga tudo que tem na mesa e sai correndo");

		}

	}

}
