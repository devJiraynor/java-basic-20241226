package com.korit.crud.service.implement;

import com.korit.crud.CrudApplication;
import com.korit.crud.entity.UserEntity;
import com.korit.crud.repository.UserRepository;
import com.korit.crud.service.UserService;

public class UserServiceImplement implements UserService {

	private final UserRepository userRepository;
	
	public UserServiceImplement(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public void getSignInUser() {
		// 로그인 유저 아이디
		String id = CrudApplication.SESSION;
		if (id == null) {
			System.out.println("로그인이 되어있지 않습니다.");
			return;
		}
		// 유저 정보를 저장소에서 불러오기
		UserEntity userEntity = userRepository.findById(id);
		if (userEntity == null) {
			System.out.println("존재하지 않는 아이디입니다.");
			return;
		}
		System.out.println("아이디 : " + userEntity.getId() + " / 닉네임 : " + userEntity.getNickname());
	}

}







