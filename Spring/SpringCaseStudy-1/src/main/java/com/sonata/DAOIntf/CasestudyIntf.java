package com.sonata.DAOIntf;
import java.util.List;

import com.sonata.model.Login;
import com.sonata.model.Task;
import com.sonata.model.User;

public interface CasestudyIntf {
	
	public List<User> getAllUser();
	public List<Task> getAllTask();
	public List<Login> getAllDetails();

}
