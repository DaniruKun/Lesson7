import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NumSort {

	public static void main(String[] args) {
		File f = new File("NumInput.txt");
		FileReader fr;
		int[] numberArray;
		numberArray = new int[20];
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			String input = reader.readLine();
			FileWriter fw = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fw);
			for (int i = 0; i < input.length(); i++) { //write line contents to array as signed integers
				numberArray[i] = Integer.parseInt(input, i);
			}
			Integer temp;
			for (int i = 0; i < numberArray.length; i++) {
				if (numberArray[i+1] < numberArray[i]) {
					temp = numberArray[i];
					numberArray[i] = numberArray[i+1];
					numberArray[i+1] = temp;
				}
				
			}
			
			fw.close();
			fr.close();
			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
