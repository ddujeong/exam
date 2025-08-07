package fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str1 = bReader.readLine().split(" ");
		int n = Integer.parseInt(str1[0]);
		int x = Integer.parseInt(str1[1]);
		
		String[] num =bReader.readLine().split(" ");
		
		for (String numString : num) {
			int num2 =Integer.parseInt(numString);
			if (num2 < x) {
				bWriter.write(num2+" ");
			}

		}bWriter.flush();
		
		
	}

}