package com.korit.crud;

import java.util.Scanner;

public class CrudApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("작업 : ");
			String request = scanner.nextLine();
			
			if (request.equals("exit")) break;
			
			System.out.println("Running...");
		}
		
		scanner.close();
	}

}






