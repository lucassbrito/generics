package aplicacao;

import java.util.Scanner;

import services.PrintService;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		PrintService<Integer> ts = new PrintService<Integer>();
		
		System.out.print("Digite quantos valores deseja: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ts.addValue(value);
		}
		
		ts.print();
		
		System.out.print("Value first: " + ts.first());
		
		sc.close();
	}
}
