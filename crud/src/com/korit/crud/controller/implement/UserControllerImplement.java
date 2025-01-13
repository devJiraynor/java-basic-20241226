package com.korit.crud.controller.implement;

import com.korit.crud.controller.UserController;
import com.korit.crud.service.UserService;

public class UserControllerImplement implements UserController {

	private final UserService userService;
	
	public UserControllerImplement(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public void getSignInUser() {
		userService.getSignInUser();
	}

}





