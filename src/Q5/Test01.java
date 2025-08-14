package Q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bReader.readLine();
		int i = Integer.parseInt(bReader.readLine());
		
		bWriter.write(s.charAt(i-1));
		bWriter.flush();
		
	}
}
