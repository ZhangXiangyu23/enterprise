package org.nuc.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.nuc.dao.IAgreementDao;
import org.nuc.entity.Agreement;
import org.nuc.entity.Employee;
import org.nuc.util.DBUtil;

public class AgreementDaoImpl implements IAgreementDao {

	@Override
	public Agreement queryAgreementByID(int id) {
		Agreement agreement= null;
		PreparedStatement pstmt = null;
		ResultSet resultset = null;
		
		try {
			String sql = "select * from agreement where id=?";
			Object[] params = {id};
			resultset = DBUtil.executequery(sql,params);
			
			while(resultset.next()) {
				String joins = resultset.getString("joins");
				int years = resultset.getInt("years");
				String retire = resultset.getString("retire");
				String iswork = resultset.getString("iswork");
				agreement = new Agreement(id,joins,years,retire,iswork);
			}
			return agreement;
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return null;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			DBUtil.closeAll(resultset, pstmt,  DBUtil.connection);
		}
	}

}
