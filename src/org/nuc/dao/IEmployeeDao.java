package org.nuc.dao;

import java.util.List;

import org.nuc.entity.Employee;

public interface IEmployeeDao {
	/**
	 * 查询所有的员工
	 * @return List<Employee>
	 */
	public List<Employee> queryAllEmployee();
	
	/**
	 * 通过用户ID查找员工
	 * @param id
	 * @return Employee
	 */
	public Employee queryEmployeeByID(int id);
	
	/**
	 * 增加员工
	 * @param Employee
	 * @return boolean
	 */
	public boolean addEmployee(Employee employee);
	

	/**
	 * 通过ID号删除员工
	 * @param id
	 * @return boolean
	 */
	public boolean deleteEmployeeByID(int id);
	/**
	 * 通过ID号进行修改员工信息
	 * @param id
	 * @param employee
	 * @return boolean
	 */
	public boolean UpdateEmployeerByID(int id,Employee employee);
}
