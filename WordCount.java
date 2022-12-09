package tranning;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class WordCount {

	public static void main(String[] args) {
		FileWriter fw;

		try {
			fw = new FileWriter("WordCount.txt");
			fw.write("The quick brown \n" + "fox jumps over \n" + "the lazy dog");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Reader rd;
		int count = 0;
		try {
			rd = new FileReader("WordCount.txt");
			int data = rd.read();
			while (data != -1) {
				while ((char) data != ' ' && (char) data != '\n' && (char) data != '\t' && data != -1) {
					data = rd.read();
				}
				count++;
				while ((char) data == ' ' || (char) data == '\n' || (char) data == '\t') {
					data = rd.read();
				}
				data = rd.read();
			}
			System.out.println(count);
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
