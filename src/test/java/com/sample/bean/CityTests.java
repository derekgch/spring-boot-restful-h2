package com.sample.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// import com.google.gson.Gson;

public class CityTests {
	
	City City;
	@Before
	public void init() {
		City = new City();
	}

	@Test
	public void testGetId() {
		City.setId(1323L);
		assertTrue(City.getId().equals(1323L));
	}

	@Test
	public void testSetId() {
		City.setId(1L);
		assertTrue(City.getId() == 1L);
	}

	@Test
	public void testGetCityName() {
		City.setName("46945867945679324679");;
		assertTrue(City.getName().equals("46945867945679324679"));
	}

	// @Test
	// public void testSetCityNumber() {
	// 	City.setCityNumber("46945867945679324679");;
	// 	assertNotNull(City.getCityNumber());
	// }

	// @Test
	// public void testGetToken() {
	// 	City.setToken("46945867945679324679rterre");;
	// 	assertTrue(City.getToken().equals("46945867945679324679rterre"));
	// }

	// @Test
	// public void testSetToken() {
	// 	City.setToken("46945867945679324679rterre");;
	// 	assertFalse(City.getToken() == null);
	// }

	// @Test
	// public void testGetExpiryDate() {
	// 	City.setExpiryDate("11/20");;
	// 	assertTrue(City.getExpiryDate().equals("11/20"));
	// }

	// @Test
	// public void testSetExpiryDate() {
	// 	City.setExpiryDate("11/20");;
	// 	assertFalse(City.getExpiryDate() == null);
	// }

	// @Test
	// public void testGenerateToken() {
	// 	City.setCityNumber("46945867945679324679");
	// 	String token =  City.generateToken();
	// 	assertTrue(token != null);
	// }

	// @Test
	// public void testGenerateTokenNull() {
	// 	String token =  City.generateToken();
	// 	assertTrue(token.equals("0000000000000000000"));
	// }
	
	// @Test
	// public void testToString() {
	// 	City.setCityNumber("463457235792357943");
	// 	City.setExpiryDate("11/19");
	// 	City.setId(2);
	// 	City.setToken("iuewh349685409e4-935u0932");
		
	// 	String token =  City.toString();
		
	// 	Gson g = new Gson();
	// 	City City = g.fromJson(token, City.class);
	// 	System.out.println(City.toString());
		
	// 	assertTrue(token !=  null);
	// }
	
	// @Test
	// public void testEncryptCityNumber() {
	// 	City.setCityNumber("46945867945679324679");
	// 	String token =  City.encryptCityNumber(City.getCityNumber());
	// 	assertFalse(token.equals(City.getCityNumber()));
	// }

	// @Test
	// public void testDecryptCityNumber() {
	// 	City.setCityNumber("46945867945679324679");
	// 	String token =  City.encryptCityNumber(City.getCityNumber());
	// 	String CityNum = City.decryptCityNumber(token);
	// 	assertTrue(CityNum.equals(City.getCityNumber()));
	// }

}