package com.korit.crud.repository.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.korit.crud.entity.UserEntity;
import com.korit.crud.repository.UserRepository;

public class UserRepositoryImplement implements UserRepository {

	private final Connection connection;
	
	public UserRepositoryImplement(Connection connection) {
		this.connection = connection;
	}
	
	@Override
	public boolean existsById(String id) {
		for (UserEntity entity: DATABASE_LIST) {
			if (entity.getId().equals(id)) return true;
		}
		return false;
	}

	@Override
	public void save(UserEntity userEntity) {
		
		final String SQL = "INSERT INTO user VALUES (?, ?, ?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, userEntity.getId());
			preparedStatement.setString(2, userEntity.getPassword());
			preparedStatement.setString(3, userEntity.getNickname());
			
			preparedStatement.executeUpdate();			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
		// DATABASE_LIST.add(userEntity);
	}

	@Override
	public UserEntity findById(String id) {
		for (UserEntity entity: DATABASE_LIST) {
			if (entity.getId().equals(id)) return entity;
		}
		return null;
	}

	@Override
	public void updateByNickname(String id, String nickname) {
		for (UserEntity entity: DATABASE_LIST) {
			if (entity.getId().equals(id)) entity.setNickname(nickname);
		}
	}

	@Override
	public void deleteById(String id) {
		UserEntity userEntity = null;
		for (UserEntity entity: DATABASE_LIST) {
			if (entity.getId().equals(id)) userEntity = entity;
		}
		DATABASE_LIST.remove(userEntity);
	}

	@Override
	public void deleteOne(UserEntity userEntity) {
		DATABASE_LIST.remove(userEntity);
	}

}






