import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("input.txt");
		int c = 0; //word oount
			FileReader fr = new FileReader(f);
			BufferedReader reader = new BufferedReader(fr);
			String l; // file line
			try {
				while ((l = reader.readLine()) != null) {
					
					for (int i = 0; i < l.length(); i++) {
						if (l.charAt(i) == ' ') {
							c++;
						}
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				reader.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(c);
	} 
		
	}


