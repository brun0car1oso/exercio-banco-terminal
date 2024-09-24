package banco_terminal;
import java.util.Scanner;

public class BancoTerminal {

public static void main(String[] args) {
		
		Scanner lerDados = new Scanner(System.in);

		int numero;
		
		String agencia; 
		
		String nomeCliente;
		
		double saldo =0;
		
		System.out.print("Digite seu nome completo: ");
		
		nomeCliente = lerDados.next(); 
		
		
		System.out.print("Digite seu número da Agência: ");
		
		agencia = lerDados.next();
		
		
		System.out.print("Digite seu número da Conta: ");
		
		numero = lerDados.nextInt();
		
		System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua Âgencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já esta disponivel para saque " );
		
		}
}
