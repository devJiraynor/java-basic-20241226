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

	@Override
	public String toString() {
		return "SignUpRequestDto [id=" + id + ", password=" + password + ", passwordCheck=" + passwordCheck
				+ ", nickname=" + nickname + "]";
	}
	
	public boolean idValidate() {
		return id.length() >= 6;
	}
	
	public boolean passwordValidate() {
		return password.length() >= 8;
	}
	
	public boolean isNotNull() {
		return id != null && password != null && passwordCheck != null && nickname != null;
	}
	
}






