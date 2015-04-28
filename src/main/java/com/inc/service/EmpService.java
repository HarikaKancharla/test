package com.inc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.inc.dao.IEmployeeDAO;
import com.inc.dao.Inc_employee;


@Controller
public class EmpService implements IEmpService{
	
	@Autowired
	private IEmployeeDAO employeeDAOImpl;	

	public IEmployeeDAO getEmployeeDAOImpl() {
		return employeeDAOImpl;
	}

	public void setEmployeeDAOImpl(IEmployeeDAO employeeDAOImpl) {
		this.employeeDAOImpl = employeeDAOImpl;
	}

	public List<Inc_employee> listEmployees() {
		// TODO Auto-generated method stub
		
		return this.employeeDAOImpl.listEmployees();
	}
	
 

}
