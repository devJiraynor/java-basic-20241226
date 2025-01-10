package com.korit.crud;

import java.util.Scanner;

import com.korit.crud.controller.AuthController;
import com.korit.crud.controller.implement.AuthControllerImplement;
import com.korit.crud.dto.auth.SignUpRequestDto;

public class CrudApplication {

	public static void main(String[] args) {
		
		AuthController authController = new AuthControllerImplement();
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("작업 : ");
			String request = scanner.nextLine();
			
			if (request.equals("exit")) break;
			
			if (request.equals("회원가입")) {
				SignUpRequestDto requestDto = new SignUpRequestDto();
				authController.signUp(requestDto);
			}
		}
		
		scanner.close();
	}

}






