package org.nuc.dao;

import java.util.List;

import org.nuc.entity.Work;

public interface IWorkDao {
	/**
	 * 查询所有的出勤信息
	 * @return List<Work>
	 */
	public List<Work> queryAllWork();
	
	/**
	 * 通过用户ID查找员工出勤信息
	 * @param id
	 * @return Work
	 */
	public Work queryWorkByID(int id);
	
	/**
	 * 通过ID号进行修改员工出勤信息
	 * @param id
	 * @return boolean
	 */
	public boolean UpdateattendanceByID(int id,float attendance,int salary);
	
	/**
	 * 通过ID号进行修改员工加班信息
	 * @param id
	 * @return boolean
	 */
	public boolean UpdateOvertimeByID(int id,int overtime,int salary);
}
