package com.sonata.DAOimpl;

import com.sonata.DAOIntf.CasestudyIntf;
import com.sonata.DBConnection.DbConnection;
import com.sonata.model.Task;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class CaseStudyImpl implements CasestudyIntf {
	
	public List<Task> getAllTask(){
		List<Task> tasklist=new ArrayList<>();
		try {
		DbConnection db=new DbConnection();
		PreparedStatement ps=db.getConnection().prepareStatement("Select * from Task");
		ResultSet res=ps.executeQuery();
		while(res.next()) {
			Task task=new Task();
			task.setTaskId(res.getInt("taskId"));
			task.setName(res.getString("name"));
			task.setOwnerId(res.getInt("ownerId"));
			task.setIsBookmarked(res.getString("isbookmarked"));
			task.setStatus(res.getString("status"));
			task.setNotes(res.getString("notes"));
			task.setCreatedOn(res.getDate("createdon"));
			task.setPriority(res.getString("priority"));
			task.setDescription(res.getString("description"));
			task.setStatusChangedOn(res.getDate("statuschangedon"));
			tasklist.add(task);			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return tasklist;
	}
	
	

}
