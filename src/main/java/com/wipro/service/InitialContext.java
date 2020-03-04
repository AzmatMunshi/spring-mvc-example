package com.wipro.service;

import java.util.Hashtable;

import javax.sql.DataSource;
//Initial Context, java comment added
public class InitialContext {
	
	InitialContext(Hashtable env)
	{
		
	}
	
	public DataSource lookup(String databaseName)
	{
		 DataSource ds = null;
		 
		 return ds;
	}

}
