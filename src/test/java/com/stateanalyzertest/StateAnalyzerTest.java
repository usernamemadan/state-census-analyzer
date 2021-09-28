package com.stateanalyzertest;

import org.junit.Test;

import com.statecensusanalyzer.MyException;
import com.statecensusanalyzer.StateCensusAnalyzer;

import junit.framework.Assert;

public class StateAnalyzerTest {
	
	@SuppressWarnings("deprecation")
	@Test
	public void testmain()
	{
		StateCensusAnalyzer stateCensusAnalyzer = new StateCensusAnalyzer("/Users/madanar/eclipse-workspace/YML training/employee.java/StateCensusAnalyzer/data/stateCensus.csv");
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
