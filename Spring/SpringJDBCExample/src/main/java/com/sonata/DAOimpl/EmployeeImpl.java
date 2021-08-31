package com.sonata.DAOimpl;

import org.springframework.stereotype.Service;
import com.sonata.model.Employee;
import com.sonata.DAOIntf.EmployeeIntf1;
import com.sonata.DBConnection.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@Service
public class EmployeeImpl implements EmployeeIntf1 {
	
	@Override
	public List<Employee> getAllEmployee(){
		List<Employee> emp=new ArrayList<>();
		try {
			DbConnection db=new DbConnection();
			PreparedStatement ps=db.getConnection().prepareStatement("Select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int eid=rs.getInt(1);
				String eName=rs.getString(2);
				double eSal=rs.getDouble(3);
				
				Employee e1=new Employee();
				e1.setEmpId(eid);
				e1.setEmpName(eName);
				e1.setEmpSal(eSal);
				
				emp.add(e1);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}
	

}
