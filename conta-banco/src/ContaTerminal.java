import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//TODO: Conhecer e importar a classe Scanner
		
		//Exibir as mensagens para o nosso usu�rio
		
		//Obter pela scanner os valores digitados no terminal
		
		//Exibir a mensagem conta criada
		
		int Numero = 3104;
		String Agencia;
		String NomeCliente;
		Double Saldo = 1500.00;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nPor favor digite o nome da Ag�ncia: " );
		Agencia = sc.next();
		System.out.println("Usu�rio: ");
		NomeCliente = sc.next();
		System.out.println();
		System.out.println("Ol� " +NomeCliente+ ", Obrigado por criar uma conta em nosso banco, sua ag�ncia � "+Agencia+ ", conta " +Numero+ " e seu saldo " +Saldo+ " J� est� dispon�vel.");
		
		
		
		
				
				
		sc.close();

	}

}
