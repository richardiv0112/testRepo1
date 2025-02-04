package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HandlingHTMLFile {

	public static void main(String[] args) throws IOException {
		// CSV stands for comma separated values
		String path = "data\\abc4.html";
		File f = new File(path);
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fw);
		
		br.write("<html>\r\n"
				+ "<head>\r\n"
				+ "<Title>\r\n"
				+ "<Hello Everyone>\r\n"
				+ "</Title>\r\n"
				+ "</head>\r\n"
				+ "</html>");
		
		br.close();

	}

}
