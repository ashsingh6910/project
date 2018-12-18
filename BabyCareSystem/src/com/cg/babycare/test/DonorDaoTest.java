package com.cg.babycare.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.babycare.bean.BabyHealthCare;
import com.cg.babycare.bean.BabyProduct;
import com.cg.babycare.dao.BabyDaoImpl;
import com.cg.babycare.exception.BabyCareException;

import java.io.FileNotFoundException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;




class DonorDaoTest 
{

	static BabyDaoImpl dao;
	static BabyProduct product;
	static BabyHealthCare care;

	@BeforeClass
	public static void initialize() 
	{
		System.out.println("in before class");
		dao = new BabyDaoImpl();
		product = new BabyProduct();
	}

	@Test
	public void testaddBaby() throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException 
	{

		assertNotNull(dao.addBaby(care));

	}

	

	@Ignore
	@Test
	public void testaddBaby1() throws BabyCareException 
	{
		// increment the number next time you test for positive test case
		assertEquals(1001, dao.addBaby(care));
	}

	/************************************
	 * Test case for addDonarDetails()
	 * 
	 ************************************/

	@Test
	public void testaddBaby2() throws BabyCareException 
	{

		care.setBabyName("Shashwathi");
		care.setBabyAge("2");
		care.setBabyGender("F");
		care.setFatherName("AHhzbshd");
		care.setMotherName("Amsnxnxxnx");
		
		care.setAddress("whitefield");
		care.setContact("9632587410");
		
		assertTrue("Data Inserted successfully",
				Integer.parseInt(dao.addBaby(care)) > 1000);

	}

	/********************************************
	 * Test case for retriveAllDetails()
	 * @throws SQLException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 ************************************************/
	@Test
	public void testviewBabyDetails() throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException 
	{
		assertNotNull(dao.viewBabyDetails(null));
	}

	/****************************************************
	 * Test case for viewById()
	 * @throws SQLException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 ******************************************************/

	@Test
	public void testById() throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException 
	{
		assertNotNull(dao.viewBabyDetails("101"));
	}

	@Ignore
	@Test
	public void testById1() throws BabyCareException, ClassNotFoundException, FileNotFoundException, SQLException 
	{
		assertEquals("	Anamika", dao.viewBabyDetails("102").getBabyName());
	}

	
}