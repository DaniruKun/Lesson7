import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("input.txt");			
			FileReader fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			String l; // file line
			String res = "";		 
			try {
				while ((l = reader.readLine()) != null) {
					l.replaceAll(",", " ");
					l.replaceAll(" +",  " ");
					res = res + l.split(" ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				reader.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(res.length());
	} 
}


