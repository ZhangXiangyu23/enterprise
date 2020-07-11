package org.nuc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.nuc.dao.IWorkDao;
import org.nuc.entity.Work;
import org.nuc.util.DBUtil;

public class WorkDaoImpl implements IWorkDao {

	@Override
	public List<Work> queryAllWork() {
		Work work= null;
		List<Work> works = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rsss = null;
	
			try {
				String sql = "select * from work";
				rsss = DBUtil.executequery(sql,null);
				
				while(rsss.next()) {
					int id = rsss.getInt("id");
					Float attendance = rsss.getFloat("attendance");
					String explains = rsss.getString("explains");
					int late = rsss.getInt("late");
					int business = rsss.getInt("business");
					int overtime = rsss.getInt("overtime");
					int salary = rsss.getInt("salary");
					
					work = new Work(id,attendance,explains,late,business,overtime,salary);
					works.add(work);
				}
				return works;
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				return null;
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}finally {
				DBUtil.closeAll(rsss, pstmt,  DBUtil.connection);
			}
	}

	@Override
	public Work queryWorkByID(int id) {
		Work work= null;
		PreparedStatement pstmt = null;
		ResultSet rswork = null;
		
		try {
			String sql = "select * from work where id=?";
			Object[] params = {id};
			rswork = DBUtil.executequery(sql,params);
			
			while(rswork.next()) {
				Float attendance = rswork.getFloat("attendance");
				String explains = rswork.getString("explains");
				int late = rswork.getInt("late");
				int business = rswork.getInt("business");
				int overtime = rswork.getInt("overtime");
				int salary = rswork.getInt("salary");
				work = new Work(id,attendance,explains,late,business,overtime,salary);
			}
			return work;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			DBUtil.closeAll(rswork, pstmt,  DBUtil.connection);
		}
	}

	
	@Override
	public boolean UpdateattendanceByID(int id,float attendance,int salary) {
		String sql ="update work set attendance = ?,salary=? where id=?";
		Object[] params = {attendance+0.01,salary+10,id};
		
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public boolean UpdateOvertimeByID(int id, int overtime,int salary) {
		String sql ="update work set overtime = ?,salary=? where id=?";
		Object[] params = {overtime+1,salary+20,id};
		
		return DBUtil.executeUpdate(sql, params);
	}

}
