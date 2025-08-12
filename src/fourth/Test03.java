package fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(reader.readLine());
		String[] arr = reader.readLine().split(" ");
		int min = Integer.parseInt(arr[0]);
		int max  = min;
		
		for (int i = 0; i <n; i++) {
			int num = Integer.parseInt(arr[i]);
	
			if (num < min) {
				min = num;
			}else if (num > max) {
				max = num;
			}
			
		
	}writer.write( min + " " + max);
	writer.flush();
	}
}


