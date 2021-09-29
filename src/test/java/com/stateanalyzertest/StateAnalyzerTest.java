package com.stateanalyzertest;

import org.junit.Test;

import com.statecensusanalyzer.MyException;
import com.statecensusanalyzer.StateCensusAnalyzer;

import junit.framework.Assert;

public class StateAnalyzerTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void givenStateCensusShouldReturnNumberOfRecords()
	{
		StateCensusAnalyzer stateCensusAnalyzer = new StateCensusAnalyzer("/Users/madanar/eclipse-workspace/"
				+ "YML training/employee.java/StateCensusAnalyzer/data/stateCensus.csv");
		int count = 0;
		try {
			count = stateCensusAnalyzer.readCSV();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertSame(null, 9, count);
	}
	
	@Test
	public void givenStateCensusInvalidInputShouldThrowMyException() {
		StateCensusAnalyzer stateCensusAnalyzer = new StateCensusAnalyzer("/Users/madanar/eclipse-workspace/YML training/employee.java/StateCensusAnalyzer/"
				+ "data/stateCensusInvalidInput.csv");
		int count = 0;
		try {
			count = stateCensusAnalyzer.readCSV();
		} catch (MyException e) {
			e.printStackTrace();
		}
		Assert.assertSame(null, 9, count);
	}
	
	@Test
	public void givenIncorrectFileTypeShouldThrowMyException() {
		StateCensusAnalyzer stateCensusAnalyzer = new StateCensusAnalyzer("/Users/madanar/eclipse-workspace/YML training/employee.java/"
				+ "StateCensusAnalyzer/data/stateCensus.txt");
		int count = 0;
		try {
			count = stateCensusAnalyzer.readCSV();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertSame(null, 9, count);
	}
	
	
	@Test
	public void givenIncorrectDelimiterShouldThrowMyException() {
		StateCensusAnalyzer stateCensusAnalyzer = new StateCensusAnalyzer("//Users/madanar/eclipse-workspace/YML training/employee.java/"
				+ "StateCensusAnalyzer/data/stateCensusInvalidDelimiter.csv");
		int count = 0;
		try {
			count = stateCensusAnalyzer.readCSV();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertSame(null, 9, count);
	}
	
	@Test
	public void givenIncorrectHeaderShouldThrowMyException() {
		StateCensusAnalyzer stateCensusAnalyzer = new StateCensusAnalyzer("/Users/madanar/eclipse-workspace/YML training/employee.java/"
				+ "StateCensusAnalyzer/data/stateCensusInvalidHeader.csv");
		int count = 0;
		try {
			count = stateCensusAnalyzer.readCSV();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertSame(null, 9, count);
	}
}
