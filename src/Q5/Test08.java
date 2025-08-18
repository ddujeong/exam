package Q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str =bReader.readLine().trim().split(" ");
		int count = 0;
		
		for (int i = 0; i < str.length; i++) {
			if( str[i].length() > 0) {
				count++;
			}
		}
		bWriter.write(String.valueOf(count));
		bWriter.flush();
		bWriter.close();
		}

}
