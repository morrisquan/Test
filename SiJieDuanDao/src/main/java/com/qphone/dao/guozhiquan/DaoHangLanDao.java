
package com.qphone.dao.guozhiquan;

import java.math.BigDecimal;
import java.util.List;

import com.qphone.pojo.DaoHangLan;

/*
 * �Ա�  daohanglan����ҳ����������crud
 */
public interface DaoHangLanDao {
	
	
	//��ѯ���������Ϣ
	List<DaoHangLan> getAll();
	
	
	//����id��ѯһ������
	DaoHangLan getOne(BigDecimal dhlId);
	
	
	
	
	
	
	
	

}
