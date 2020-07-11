package org.nuc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.nuc.dao.IUserDao;
import org.nuc.entity.User;
import org.nuc.util.DBUtil;


public class UserDaoImpl implements IUserDao {

	@Override
	public User queryCheckUser(User user) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
			try {
				String sql ="select * from user where id=? and password=?";
				Object[] params = {user.getId(),user.getPassword()};
				rs = DBUtil.executequery(sql,params);
				
				if(rs.next()) {
					String type = rs.getString("type");
					String name = rs.getString("name");
					int id = rs.getInt("id");
					user.setId(id);
					user.setType(type);
					user.setName(name);
				}
				return user;
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				return null;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}finally {
				DBUtil.closeAll(rs, pstmt,  DBUtil.connection);
			}
	}



}
