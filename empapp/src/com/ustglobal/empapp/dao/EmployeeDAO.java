package com.ustglobal.empapp.dao;

import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface EmployeeDAO {
	public List<EmployeeBean> getdata();
	public EmployeeBean searchEmployeeData(int id);
//	public int insertData(int id, String name,int sal,String gender);
//	public int updataData(int id, String name,int sal,String gender);
//	public int deleteData(int id);
//	public int insertData(EmployeeBean);
	public int updataData(EmployeeBean b);
	public int deleteData(EmployeeBean b);  
	public int insertData(EmployeeBean b);
}
