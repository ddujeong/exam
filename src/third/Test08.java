package third;

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
		
		int t = Integer.parseInt( bReader.readLine());
		
		for (int i = 1; i <= t; i++) {
			String s = bReader.readLine();
			int a = Integer.parseInt(s.split(" ")[0]);
			int b = Integer.parseInt(s.split(" ")[1]);
			int c = a + b;
			
			bWriter.write("Case #"+ i +": " + a + " + " + b + " = " + c + "\n");
		}bWriter.flush();
	}

}
