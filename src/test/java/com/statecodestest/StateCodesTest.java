package com.statecodestest;

import org.junit.Assert;
import org.junit.Test;

import com.statecensusanalyzer.MyException;
import com.statecensusanalyzer.StateCensusAnalyzer;


public class StateCodesTest {

	@Test
	public void givenStateCensusShouldReturnNumberOfRecords()
	{
		StateCensusAnalyzer stateCensusAnalyzer = new StateCensusAnalyzer("/Users/madanar/eclipse-workspace/YML training/employee.java/"
				+ "StateCensusAnalyzer/data/StateCodes.csv");
		int count = 0;
		try {
			count = stateCensusAnalyzer.readCSV();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertSame(null, 36, count);
	}
	
}
