package com.korit.crud.service.implement;

import com.korit.crud.dto.auth.SignUpRequestDto;
import com.korit.crud.service.AuthService;

public class AuthServiceImplement implements AuthService {

	@Override
	public void signUp(SignUpRequestDto requestDto) {
		// 아이디가 중복됐는지 저장소에서 확인
		// - 중복된 아이디라면 '중복된 아이디입니다.' 출력 후 메서드 종료
		// 해당 유저 정보를 저장소에 저장 후 '성공했습니다.' 출력
	}

}






