package org.nuc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.nuc.dao.IEmployeeDao;
import org.nuc.entity.Employee;
import org.nuc.util.DBUtil;

public class EmployeeDaoImpl implements IEmployeeDao {

	@Override
	public List<Employee> queryAllEmployee() {
		Employee employee= null;
		List<Employee> employees = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
			try {
				String sql = "select id,name,sex,contect,identity,education,address from employee";
				rs = DBUtil.executequery(sql,null);
				
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String sex = rs.getString("sex");
					String contect = rs.getString("contect");
					String identity = rs.getString("identity");
					String education = rs.getString("education");
					String address = rs.getString("address");
					employee = new Employee(id,name,sex,contect,identity,education,address);
					employees.add(employee);
				}
				return employees;
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
	public Employee queryEmployeeByID(int id) {
		Employee employee= null;
		PreparedStatement pstmt = null;
		ResultSet rss = null;
		
		try {
			String sql = "select password,name,sex,contect,identity,education,address,type from employee where id=?";
			Object[] params = {id};
			rss = DBUtil.executequery(sql,params);
			
			while(rss.next()) {
				String password = rss.getString("password");
				String name = rss.getString("name");
				String sex = rss.getString("sex");
				String contect = rss.getString("contect");
				String identity = rss.getString("identity");
				String education = rss.getString("education");
				String address = rss.getString("address");
				String type = rss.getString("type");
				employee = new Employee(password,name,sex,contect,identity,education,address,type);
			}
			return employee;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			DBUtil.closeAll(rss, pstmt,  DBUtil.connection);
		}
	}

	@Override
	public boolean addEmployee(Employee employee) {
		String sql ="insert into employee(password,name,sex,contect,identity,education,address,type) values(?,?,?,?,?,?,?,?)";
		Object[] params = {employee.getPassword(),employee.getName(),employee.getSex(),employee.getContect(),employee.getIdentity(),employee.getEducation(),employee.getAddress(),employee.getType()};	
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public boolean deleteEmployeeByID(int id) {
		String sql ="delete from employee where id =?";
		Object[] params = {id};
		return DBUtil.executeUpdate(sql, params);
	}

	@Override
	public boolean UpdateEmployeerByID(int id, Employee employee) {
		String sql ="update employee set password = ?,name=?,sex=?,contect=?,identity=?, education=?,address=? where id=?";
		Object[] params = {employee.getPassword(),employee.getName(),employee.getSex(),employee.getContect(),employee.getIdentity(),employee.getEducation(),employee.getAddress(),id};
		
		return DBUtil.executeUpdate(sql, params);
	}

}
