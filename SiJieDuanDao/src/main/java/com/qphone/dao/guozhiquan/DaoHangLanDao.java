
package com.qphone.dao.guozhiquan;

import java.math.BigDecimal;
import java.util.List;

import com.qphone.pojo.DaoHangLan;

/*
 * 对表  daohanglan（首页导航栏）的crud
 */
public interface DaoHangLanDao {
	
	
	//查询表的所有信息
	List<DaoHangLan> getAll();
	
	
	//根据id查询一个对象
	DaoHangLan getOne(BigDecimal dhlId);
	
	
	
	
	
	
	
	

}
