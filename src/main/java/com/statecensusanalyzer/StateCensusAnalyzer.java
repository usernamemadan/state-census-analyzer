package com.statecensusanalyzer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReader;

public class StateCensusAnalyzer {

	final String PATH;
	public StateCensusAnalyzer(String PATH) {
		this.PATH = PATH;
	}
	
	public int readCSV() throws MyException{
		int count = 0;
		try {
			if(!PATH.contains(".csv")) {
				throw new MyException("Invalid file type");
			}
			
	        FileReader filereader = new FileReader(PATH);
	        Scanner sc=new Scanner(filereader);
	        String line = sc.nextLine();
	        String[] record;
	        if(!line.contains(",")) {
	        	throw new MyException("Invalid Delimeter");
	        }
	        else {
	        	record = line.split(",");
	        	for (String string : record) {
					if(string == null || string.equals("0") || string.equals("")) {
						throw new MyException("Invalid Header");
					}
				}
	        }
	        
	        FileReader filereader2 = new FileReader(PATH);
	        
	        CSVReader csvReader = new CSVReader(filereader2);
	        String[] nextRecord;
	 
	        while ((nextRecord = csvReader.readNext()) != null) {
	            for (String cell : nextRecord) {
	                System.out.print(cell + "\t");
	                if(cell == null || cell.equals("0"))
	                	throw new MyException("invalid input");
	            }
	            System.out.println();
	            count++;
	        }
	    }
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
			throw new MyException("invalid type");
		}
		
		return count;
	}
}
