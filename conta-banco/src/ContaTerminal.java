import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//TODO: Conhecer e importar a classe Scanner
		
		//Exibir as mensagens para o nosso usuário
		
		//Obter pela scanner os valores digitados no terminal
		
		//Exibir a mensagem conta criada
		
		int Numero = 3104;
		String Agencia;
		String NomeCliente;
		Double Saldo = 1500.00;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nPor favor digite o nome da Agência: " );
		Agencia = sc.next();
		System.out.println("Usuário: ");
		NomeCliente = sc.next();
		System.out.println();
		System.out.println("Olá " +NomeCliente+ ", Obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+ ", conta " +Numero+ " e seu saldo " +Saldo+ " Já está disponível.");
		
		
		
		
				
				
		sc.close();

	}

}
