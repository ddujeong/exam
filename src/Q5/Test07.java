package Q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test07 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(bReader.readLine());
		
		for (int i = 0; i < t; i++) {
			String[] qr =bReader.readLine().split(" ");
			int r = Integer.parseInt(qr[0]);
			String s = qr[1];
			for (int j = 0; j < s.length(); j++) {
				for (int k = 0; k < r; k++) {
					bWriter.write(s.charAt(j));
				
					
				}
			}bWriter.newLine();
		}
		bWriter.flush();		
		bWriter.close();
	}

}
