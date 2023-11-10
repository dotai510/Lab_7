package Lab_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestReadfFile {
	public static void main(String[] args) throws FileNotFoundException {
			Scanner input = new Scanner(new File("E:\\File_Môn Học\\Git_CTDL\\Lab_7\\Lab_7\\src\\Lab_7\\fit.txt"));
			
			while (input.hasNext()) {
			String word = input.next();
			System.out.println(word);
				
			}
	}
}
