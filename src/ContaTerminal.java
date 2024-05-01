import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		double saldo = 25;
		double valorSolicitado = 18;
		
		double saque = saldo - valorSolicitado;
		
		if(saldo < valorSolicitado) {
			System.out.println("Saldo Insuficiente");
		}
		
		System.out.println("Saldo: " + saque);
		
		

		
		
	}

}
