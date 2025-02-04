package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HandlingTextFilePractice {

	public static void main(String[] args) throws IOException {
		String path = "data\\textpractice.txt";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line = br.readLine()) !=null) {
			System.out.println(line);
		}
		br.close();
	}

}
