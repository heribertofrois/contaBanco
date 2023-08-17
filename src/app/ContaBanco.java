package app;

import java.util.Scanner;

import dominio.ContaTerminal;

public class ContaBanco {
	

	public static void main(String[] args) {
		
		Scanner leitorTerminal = new Scanner(System.in);
		ContaTerminal contaTerminal = new ContaTerminal();
		System.out.print("Por favor, digite o número da sua conta !");
		contaTerminal.setNumero(leitorTerminal.nextInt());
		System.out.print("Por favor, digite a agencia !");
		contaTerminal.setAgencia(leitorTerminal.next());
		System.out.print("Por favor, digite o nome do cliente !");
		contaTerminal.setNomeCliente(leitorTerminal.next());
		System.out.print("Por favor, digite o saldo da conta !");
		contaTerminal.setSaldo(leitorTerminal.nextDouble());
		
		leitorTerminal.close();
		
		
		
		System.out.print("Olá "+ contaTerminal.getNomeCliente()+" , obrigado por criar uma conta em nosso banco, sua agência é "+ contaTerminal.getAgencia()+",conta "+ contaTerminal.getNumero()+" e seu saldo " + contaTerminal.getSaldo()+" já está disponível para saque.");
		

	}

}
