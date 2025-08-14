package Q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(bReader.readLine());
		int sum = 0;
		String num =bReader.readLine();
		for (int i = 0; i < n; i++) {
			sum += num.charAt(i) - '0';
		}bWriter.write(String.valueOf(sum));
		bWriter.flush();
	}

}
