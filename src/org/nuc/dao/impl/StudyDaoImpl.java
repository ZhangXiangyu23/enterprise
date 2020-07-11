package org.nuc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.nuc.dao.IStudyDao;
import org.nuc.entity.Study;
import org.nuc.util.DBUtil;

public class StudyDaoImpl implements IStudyDao {

	@Override
	public List<Study> queryAllStudy() {
		Study study= null;
		List<Study> studys = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
			try {
				String sql = "select * from study";
				rs = DBUtil.executequery(sql,null);
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String starttime = rs.getString("starttime");
					String content = rs.getString("content");				
					String endtime = rs.getString("endtime");
					
					study = new Study(id, starttime, endtime, content);
					studys.add(study);
				}
				return studys;
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

	@Override
	public Study queryStudyByID(int id) {
		Study study= null;
		PreparedStatement pstmt = null;
		ResultSet rsstudy = null;
		
		try {
			String sql = "select * from study where id=?";
			Object[] params = {id};
			rsstudy = DBUtil.executequery(sql,params);
			
			while(rsstudy.next()) {
				String starttime = rsstudy.getString("starttime");
				String endtime = rsstudy.getString("endtime");
				String content = rsstudy.getString("content");
				study = new Study(id,starttime,endtime,content);
			}
			return study;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			DBUtil.closeAll(rsstudy, pstmt,  DBUtil.connection);
		}
	}

	@Override
	public boolean addStudy(Study study) {
		String sql ="insert into study(id,starttime,endtime,content) values(?,?,?,?)";
		Object[] params = {study.getId(),study.getStarttime(),study.getEndtime(),study.getContent()};	
		return DBUtil.executeUpdate(sql, params);
	}

}
