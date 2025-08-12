package fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] submit =  new boolean[31];

		for (int i = 0; i < 28; i++) {
			int num = Integer.parseInt(bReader.readLine());
			submit[num] = true; 
		}
		for (int i = 1; i <= 30; i++) {
			if (!submit[i]) {
				bWriter.write(i + "\n");
			}
		}
		
		bWriter.flush();
	}

}
