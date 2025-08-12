package fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 9;
		int max = Integer.MIN_VALUE;
		int maxindex =0;
		
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt( bReader.readLine());
			if (max < num) {
				max = num;
				maxindex = i;
			}
		}bWriter.write(String.valueOf(max) );
		bWriter.newLine();
		bWriter.write(String.valueOf( maxindex + 1));

		
		bWriter.flush();
		bWriter.close();
	}

}
