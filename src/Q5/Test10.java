package Q5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num = bReader.readLine();
		int time = 0;
		
		int[] dial = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		
		for (int i = 0; i < num.length() ; i++) {
			char ch = num.charAt(i);
			time += dial[ch -'A'];
		}bWriter.write(String.valueOf(time));
		bWriter.flush();
		bWriter.close();
	}
	
}
