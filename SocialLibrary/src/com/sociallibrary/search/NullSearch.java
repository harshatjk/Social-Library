package com.sociallibrary.search;

import java.sql.ResultSet;
import java.sql.Connection;

import com.sociallibrary.JDBCConnectionFactory;
import com.sociallibrary.db.DBHelper;


public class NullSearch implements SearchOperation {
	
	@Override
	public ResultSet doSearch(String name) {
		String sql = "SELECT * "
				+ "FROM nullreference";
		return DBHelper.getQueryResult(sql);
	}

}
