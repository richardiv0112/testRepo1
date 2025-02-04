package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HandlingCSVFile {

	public static void main(String[] args) throws IOException {
		// CSV stands for comma separated values
		String path = "data\\abc3.csv";
		File f = new File(path);
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fw);
		
		br.write("Employee, Title, Age");
		br.newLine();
		br.write("John, QA, 55");
		br.newLine();
		br.write("Jenna, IAM Engineer, 27");
		br.newLine();
		br.close();

	}

}
