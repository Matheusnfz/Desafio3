package aplicattion;

import java.util.Scanner;

import entities.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite o nome do primeiro funcionário: ");
		String nome = sc.nextLine();
		System.out.println("Digite o salário bruto: ");
		double salarioBruto = sc.nextDouble();
		System.out.println("Digite a taxa: ");
		double taxa = sc.nextDouble();
		
		Funcionario funcionario1 = new Funcionario(nome, salarioBruto, taxa);
				
		funcionario1.obterSalarioLiquido();
		System.out.println("Dados do primeiro funcionário: "+funcionario1.toString());
		
		System.out.println();
		
		funcionario1.aumentoSalario(10);
		System.out.println("Aumento do salário do primeiro funcionário: " +funcionario1.toString());
		
		System.out.println();
		
		System.out.println("Digite o nome do segundo funcionário: ");
		sc.nextLine();
		nome = sc.nextLine();
		System.out.println("Digite o salário bruto: ");
		salarioBruto = sc.nextDouble();
		System.out.println("Digite a taxa: ");
		taxa = sc.nextDouble();
		
		Funcionario funcionario2 = new Funcionario(nome, salarioBruto, taxa);
		
		funcionario2.obterSalarioLiquido();
		System.out.println("Dados do segundo funcionário: "+funcionario2.toString());
		
		System.out.println();
		
		funcionario2.aumentoSalario(10);
		System.out.println("Aumento do salário do segundo funcionário: " +funcionario2.toString());
		
		System.out.println();
		
		System.out.println("Atualização do salário dos dois funcionários 1: " +funcionario1.toString()+ " e 2:"+ funcionario2.toString());
		
	
		
		sc.close();
		
	}

}

