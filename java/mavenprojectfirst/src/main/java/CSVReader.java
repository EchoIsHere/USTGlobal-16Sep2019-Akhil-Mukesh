package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {
public static void main(String[] args) {
	
	try(FileReader in = new FileReader("csv.txt");
			BufferedReader reader = new BufferedReader(in)){
			while(reader.ready()) {
				String line = reader.readLine();
				String [] words = line.split(",");
				System.out.println("name:"+words[0]);
				System.out.println("Id:"+words[1]);
				System.out.println("===================");
			}
	}
		catch(Exception e) {
		e.printStackTrace();
		
	
	}

	
	
}
}


