package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HandlingCSVFilePractice {

	public static void main(String[] args) throws IOException {
		// CSV stands for comma separated values
		String path = "data\\practiceCSV.csv";
		File f = new File(path);
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fw);
		
		br.write("Name, Age, Title, Department");
		br.newLine();
		br.write("Bob, 55, Developer, Tech");
		br.newLine();
		br.write("Sally, 22, Sales Rep, Sales");
		br.newLine();
		

		br.close();
	}

}
