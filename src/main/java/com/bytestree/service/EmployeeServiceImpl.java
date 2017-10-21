package com.bytestree.service;

import com.bytestree.dao.EmployeeDaoImpl;
import com.bytestree.model.Employee;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author bytesTree
 * @see <a href="http://www.bytestree.com/">BytesTree</a>
 * 
 */
@Service
@Transactional(readOnly = false)
public class EmployeeServiceImpl {

	final static Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	@Autowired
	EmployeeDaoImpl employeeDao;

	public Employee getEmployee(Long id) {
		logger.debug("Getting employee with id " + id);
		return employeeDao.findById(id);
	}

	/**
	 * Add new employee
	 * 
	 * @param employee:
	 *            Employee to add
	 */
//	@Override
	public void addNewEmployee(Employee employee) {
		Long id = (Long) employeeDao.save(employee);
		logger.debug("Id of new Employee " + id);
	}

}
