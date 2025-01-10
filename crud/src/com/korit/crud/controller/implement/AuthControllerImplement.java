package com.korit.crud.controller.implement;

import com.korit.crud.controller.AuthController;
import com.korit.crud.dto.auth.SignUpRequestDto;

public class AuthControllerImplement implements AuthController {

	@Override
	public void signUp(SignUpRequestDto requestDto) {
		if (requestDto == null) {
			System.out.println("오류가 발생했습니다.");
			return;
		}
		String id = requestDto.getId();
		if (id == null) {
			System.out.println("오류가 발생했습니다.");
			return;
		}
		if (id.length() < 6) {
			System.out.println("아이디는 6자 이상이어야 합니다.");
			return;
		}
		String password = requestDto.getPassword();
		if (password == null) {
			System.out.println("오류가 발생했습니다.");
			return;
		}
		if (password.length() < 8) {
			System.out.println("비밀번호는 8자 이상이어야 합니다.");
			return;
		}
	}

}







