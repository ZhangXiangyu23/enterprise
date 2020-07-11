package org.nuc.dao;


import org.nuc.entity.User;

public interface IUserDao {
	
	/**
	 * 查询所有的用户
	 * @return User
	 */
	public User queryCheckUser(User user);

	
}
