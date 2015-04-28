package com.inc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeDAOImpl implements IEmployeeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


    @SuppressWarnings("unchecked")
	public List<Inc_employee> listEmployees() {
		  Session session = this.sessionFactory.openSession();
			List<Inc_employee> empList = session.createQuery("from Inc_employee").list();
	       /* for(Inc_employee emp : empList){
	            logger.info("Person List::"+p);
	        }*/
			session.close();
	        return empList;
	}

}
