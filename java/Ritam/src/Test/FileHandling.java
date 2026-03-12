 
package Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
public class FileHandling {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Ritam\\Programming\\Capgemini\\java\\MyFirstFile.txt");
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		
		try {
			if(file.createNewFile()) {
				System.out.println("created");
			}
			else {
				System.out.println("exits!!!");
			}
			
			fileWriter = new FileWriter(file);
			fileWriter.write("This is my first sententec");
			fileWriter.append("asdfgh");
			System.out.println("written succesfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				 
				e.printStackTrace();
			}
		}
		
		try {
			fileReader = new FileReader(file);
			int asciiOfCharecter;
			while((asciiOfCharecter=fileReader.read())!=-1) {
				System.out.print((char)asciiOfCharecter);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}