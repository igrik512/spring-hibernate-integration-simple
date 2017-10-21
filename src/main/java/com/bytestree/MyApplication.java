package com.bytestree;

import com.bytestree.dao.EmployeeDaoImpl;
import com.bytestree.model.Employee;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author bytesTree
 * @see <a href="http://www.bytestree.com/">BytesTree</a>
 * 
 */
@Component
public class MyApplication {

	final static Logger logger = Logger.getLogger(MyApplication.class);

	@Autowired
	private EmployeeDaoImpl empService;
	
	public void performDbTasks()
	{
		Employee empNew = new Employee(1l, "Bytes", "Tree", "Senior Developer", 2000);

		// Save new employee
		empService.save(empNew);
		
		// Get saved employee
		Employee employee = empService.findById(empNew.getId());
		logger.debug("Retrieving saved employee " + employee);

	}

}
