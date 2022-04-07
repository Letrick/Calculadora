
import java.util.Scanner;


public class ProgramaMain extends multiplicacao, soma, diviso, subtracao {	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a operação que deseja ? [1 - Teste]");
		int opc = scan.nextInt(); // le a entrada do terminal
		
//		Exemplo das chamadas que deverão ser feitas
//		ICalculadora calculadora = new Soma();
//		ICalculadora calculadora = new Subtracao();
//		ICalculadora calculadora = new Divisao();
//		ICalculadora calculadora = new Multiplicacao();
//		
//		calculadora.calcular(null);
		
		scan.close();
		
	}
}
