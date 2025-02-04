package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HandlingTextFile {

	public static void main(String[] args) throws IOException {
		String path = "data\\abc2.txt";
		File f = new File(path);

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line = br.readLine()) != null) {
			System.out.println(line);
			
		}
//		System.out.println(br.readLine()+" 1");
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		//No text for this line so null value is returned
//		System.out.println(br.readLine());
		
		br.close();
	}

}
