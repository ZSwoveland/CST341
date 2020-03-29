package com.gcu.data;

import java.util.List;
import java.sql.*;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.model.Order;

public class OrdersDataService<T> implements DataAccessInterface<T> {

	public OrdersDataService() {
		// TODO Auto-generated constructor stub
	}


	@Override
	@Autowired
	public List<T> findAll() {
		// TODO Auto-generated method stub
		String dbName = "C:\\Users\\zswoveland\\MYDB";
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection conn = DriverManager.getConnection(dbName, "user","derby");
			
			if(conn != null) {
				System.out.print("Success");
				
				
				String sqlState = "Select* From testapp.Orders";
				
				Statement stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery(sqlState);
				
				while (rs.next()) {
					
					System.out.print(rs.toString());
				}
				
				rs.close();
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("Failure");
		}
		
	
		return null;
	}


	@Override
	public T findbyID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(T t) {
		// TODO Auto-generated method stub
		return false;
	}





	
	


}
