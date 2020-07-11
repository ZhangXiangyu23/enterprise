package org.nuc.dao;

import java.util.List;

import org.nuc.entity.Study;

public interface IStudyDao {
	/**
	 * 查询所有的培训信息
	 * @return List<Work>
	 */
	public List<Study> queryAllStudy();
	
	/**
	 * 通过用户ID查找员工培训信息
	 * @param id
	 * @return Study
	 */
	public Study queryStudyByID(int id);
	
	/**
	 * 增加培训
	 * @param Study
	 * @return boolean
	 */
	public boolean addStudy(Study study);
}
