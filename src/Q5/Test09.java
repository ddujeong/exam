package Q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str =bReader.readLine().trim().split(" ");
	
			String a = new StringBuilder(str[0]).reverse().toString();
			String b = new StringBuilder(str[1]).reverse().toString();
			
			int numa = Integer.parseInt(a);
			int numb = Integer.parseInt(b);
			
			bWriter.write(Math.max(numa, numb));
			bWriter.flush();
			bWriter.close();
	}

}
