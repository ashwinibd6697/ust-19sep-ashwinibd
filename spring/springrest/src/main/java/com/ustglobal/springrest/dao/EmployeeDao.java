package com.ustglobal.springrest.dao;

import java.util.List;

import com.ustglobal.springrest.bean.EmployeeBean;

public interface EmployeeDao {

	public boolean addEmployee(EmployeeBean bean);
	public boolean modifyEmployee(EmployeeBean bean);
	public boolean deleteEmployee(int id);
	public EmployeeBean getEmployee(int id);
	public List<EmployeeBean> getAllEmployee();
	
	
}
