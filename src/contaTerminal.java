

import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o seu nome");
		String nomeCliente = scanner.next();
		
		System.out.println("Digite o seu número");
		int numeroCliente = scanner.nextInt();
		
		System.out.println("Digite a sua agência");
		String agenciaCliente = scanner.next();
		
		System.out.println("Digite o seu saldo");
		double saldoCliente = scanner.nextDouble();
		
		System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agenciaCliente +", conta "+ numeroCliente +" e seu saldo "+ saldoCliente +" já está disponível para saque");

	}

}
