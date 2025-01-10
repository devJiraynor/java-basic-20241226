package com.korit.crud.dto.auth;

import java.util.Scanner;

// DTO (Data Transfer Object): 모듈간 데이터 전송을 위한 객체
public class SignUpRequestDto {
	private String id;
	private String password;
	private String passwordCheck;
	private String nickname;
	
	public SignUpRequestDto() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디 : ");
		this.id = scanner.nextLine();
		System.out.print("비밀번호 : ");
		this.password = scanner.nextLine();
		System.out.print("비밀번호 확인 : ");
		this.passwordCheck = scanner.nextLine();
		System.out.print("닉네임 : ");
		this.nickname = scanner.nextLine();
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordCheck() {
		return passwordCheck;
	}

	public String getNickname() {
		return nickname;
	}
	
}






