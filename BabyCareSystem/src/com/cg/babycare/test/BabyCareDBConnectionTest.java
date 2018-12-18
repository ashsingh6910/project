package com.cg.babycare.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.cg.babycare.dao.BabyDaoImpl;
import com.cg.babycare.exception.BabyCareException;
import com.cg.babycare.util.BabyCareDBConnection;

class BabyCareDBConnectionTest {

	static BabyDaoImpl daotest;
	static Connection dbCon;

	@BeforeClass
	public static void initialise() {
		daotest = new BabyDaoImpl();
		dbCon = null;
	}

	@Before
	public void beforeEachTest() {
		System.out.println("Starting DBConnection Test Case");
	}

	
	@Test
	public void test() throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException {
		Connection dbCon = BabyCareDBConnection.getConnection();
		Assert.assertNotNull(dbCon);
	}

	@After
	public void afterEachTest() {
		System.out.println("End of DBConnection Test Case");
	}

	@AfterClass
	public static void destroy() {
		System.out.println("End of Tests");
		daotest = null;
		dbCon = null;
	}

}
