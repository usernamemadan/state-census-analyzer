package com.statecensusanalyzer;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class StateCensusAnalyzer {

	final String PATH;
	public StateCensusAnalyzer(String PATH) {
		this.PATH = PATH;
	}
	
	public int readCSV() throws MyException{
		int count = 0;
		try {
	        FileReader filereader = new FileReader(PATH);
	        
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextRecord;
	 
	        while ((nextRecord = csvReader.readNext()) != null) {
	            for (String cell : nextRecord) {
	                System.out.print(cell + "\t");
	                if(cell == null || cell == "0")
	                	throw new MyException("invalid input");
	            }
	            System.out.println();
	            count++;
	        }
	    }
	    catch (Exception e) {
	    	
	        e.printStackTrace();
	    }
		
		return count;
	}
}
