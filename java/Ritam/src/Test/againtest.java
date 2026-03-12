 
package Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
public class  againtest{
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Ritam\\Programming\\Capgemini\\java\\MyFirstFile.txt");
		
		try (FileWriter fileWriter = new FileWriter(file);){
			if(file.createNewFile()) {
				System.out.println("created");
			}
			else {
				System.out.println("exits!!!");
			}
			fileWriter.write("This is my first sententec");
			fileWriter.append("asdfgh");
			System.out.println("written succesfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader fileReader1 = new FileReader(file);) {
			int asciiOfCharecter;
			while((asciiOfCharecter=fileReader1.read())!=-1) {
				System.out.print((char)asciiOfCharecter);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}