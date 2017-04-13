package main;

import java.util.Scanner;

public class SmartScanner {
	public Scanner scanner;

	public SmartScanner() {
		scanner = new Scanner(System.in);
	}

	public double lerInput() {
		String leitura = scanner.nextLine();

		if (leitura.contains(",")) {
			leitura = leitura.replace(",", ".");
		}
		if (leitura.contains("%")) {
			leitura = leitura.replace("%", "");
		}

		try {

			return Double.parseDouble(leitura);

		} catch (Exception e) {

		}
		return -1;
	}

}
