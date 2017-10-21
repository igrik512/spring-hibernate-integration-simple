package com.bytestree.dao;

import com.bytestree.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * 
 * @author bytesTree
 * @see <a href="http://www.bytestree.com/">BytesTree</a>
 * 
 */
@Repository
@Transactional
public class EmployeeDaoImpl /*implements EmployeeDao */{
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
//	@Override
	public Serializable save(Employee employee) {
		return getSession().save(employee);
	}
	
//	@Override
	public Employee findById(final Serializable id) {
		return getSession().get(Employee.class, id);
	}


}
