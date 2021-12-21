package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("soma a + b, " + soma);
		System.out.println("subtração a - b, " + subtracao);
		System.out.println("multiplicacao a * b, " + multiplicacao);
		System.out.println("divisao a / b, " + divisao);
		
	}
	public static int soma(int a,int b) {
		return a + b;
		
	}
	public static int subtracao(int a, int b) {
		return a - b;
		
	}
	public static double divisao(int a, int b) {
		return a/b;
		
	}
	public static double multiplicacao(int a, int b) {
		return a*b;
		
	}
}
