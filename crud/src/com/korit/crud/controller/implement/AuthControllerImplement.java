package com.korit.crud.controller.implement;

import com.korit.crud.controller.AuthController;
import com.korit.crud.dto.auth.SignUpRequestDto;
import com.korit.crud.service.AuthService;

public class AuthControllerImplement implements AuthController {

	private final AuthService authService;
	
	public AuthControllerImplement(AuthService authService) {
		this.authService = authService;
	}
	
	@Override
	public void signUp(SignUpRequestDto requestDto) {
		if (requestDto == null) {
			System.out.println("오류가 발생했습니다.");
			return;
		}
		if (!requestDto.validate()) return;
		
		authService.signUp(requestDto);
	}

}







