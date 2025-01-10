package com.korit.crud.entity;

// Entity: 저장소 객체
public class UserEntity {
	private String id;
	private String password;
	private String nickname;
	
	public UserEntity(String id, String password, String nickname) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getNickname() {
		return nickname;
	}
	
}






