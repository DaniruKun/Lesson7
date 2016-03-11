import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f = new File("input.txt");
		int c = 0; //word oount
			FileReader fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			String l; // file line
			String punc = ",.;'-";
			String res = "";
			try {
				while ((l = reader.readLine()) != null) {
					l.replaceAll(" +",  " ");
					res = res + l.split(" ");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
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


