package main;

public class Main {
	public static void main(String[] args) {

		SmartScanner scanner = new SmartScanner();

		System.out.println("Informe o montante inicial:");
		double montante = scanner.lerInput();

		System.out.println("Informe a taxa:");
		double taxa = scanner.lerInput();

		System.out.println("Informe o número de períodos:");
		double periodo = scanner.lerInput();
		
		taxa = 1 + taxa*0.01;

		double resultado = montante * Math.pow(taxa, periodo);
		
		if (resultado>=0){
			System.out.println("O montante final é R$ " + resultado);	
		}else{
			System.out.println("O montante não pode ser calculado");
		}
	}
}
