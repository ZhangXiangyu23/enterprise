package org.nuc.dao;

import org.nuc.entity.Agreement;

public interface IAgreementDao {
	/**
	 * 通过用户ID查找合同
	 * @param id
	 * @return Agreement
	 */
	public Agreement queryAgreementByID(int id);
}
