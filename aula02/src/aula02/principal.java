package aula02;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual seu nome?");
		String nome = leia.nextLine();
		
		System.out.print("Quantos anos trabalhando para empresa?");
		int idadeDeEmpresa = leia.nextInt();
		
		System.out.print("Qual seu salário atual?");
		float salario = leia.nextFloat();
		
		if(idadeDeEmpresa > 10) {
			salario = (float) (salario + salario * 0.10);
		}
			
		System.out.print("Novo Salario do funcionário(a): "+ nome +" é de R$: " + salario);
		
		

	}

}
