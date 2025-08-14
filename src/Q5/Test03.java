package Q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bReader.readLine());
		String str = "";
	
		for (int i = 0; i < t; i++) {
			str = bReader.readLine();
			bWriter.write(str.charAt(0) +""+ (str.charAt(str.length()-1)));
			bWriter.newLine();
		}
		bWriter.flush();
		
	}

}
