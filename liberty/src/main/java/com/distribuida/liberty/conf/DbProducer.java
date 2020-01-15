package com.distribuida.payara.conf;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

@ApplicationScoped
public class DbProducer {
	
	public static final String DRIVER_CLASS = "org.postgresql.Driver";
	public static final String URL = "jdbc:postgresql://localhost:5432/distribuida";
	public static final String USER = "postgres";
	public static final String PASS = "postgres";
	
	@ApplicationScoped
	@Produces
	public DataSource dataSource() {
		
		BasicDataSource ds = new BasicDataSource();
		
		ds.setDriverClassName(DRIVER_CLASS);
		ds.setUrl(URL);
		ds.setUsername(USER);
		ds.setPassword(PASS);
		
		return ds;
	}

}
