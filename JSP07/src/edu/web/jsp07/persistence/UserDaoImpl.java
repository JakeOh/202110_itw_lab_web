package edu.web.jsp07.persistence;

import edu.web.jsp07.model.User;

public class UserDaoImpl implements UserDao {
	
	private static UserDaoImpl instance = null;
	
	private UserDaoImpl() {}
	
	public static UserDaoImpl getInstance() {
		if (instance == null) {
			instance = new UserDaoImpl();
		}
		return instance;
	}

	@Override
	public User checkSignIn(String id, String pw) {
		// TODO Auto-generated method stub
		return null;
	}

}
