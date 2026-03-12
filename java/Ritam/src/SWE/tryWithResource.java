package SWE;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tryWithResource {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Sudeshna Pathak\\eclipse-workspace\\Capgemini_Java\\src\\fileHandling\\files\\My-first-file.txt");
		try(FileWriter fileWriter = new FileWriter(file)) {
			if(file.createNewFile()){
					System.out.println("File Created");
				}
			else
				{
					System.out.println("File Already Present");
				}
			fileWriter.write("This is my first sentence \n");
			fileWriter.append("2nd Sentence");
			System.out.println("Written Successfully");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	
		try(FileReader fileReader = new FileReader(file)) {
			int ascii;
			while((ascii = fileReader.read()) != -1)
			{
				System.out.print((char)ascii);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}