package fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test08 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int count = 0;
		
		int[] num = new int[10];
		boolean[] visited = new boolean[42];
		
		for (int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(bReader.readLine());
			int b = num[i] %42;
			if (!visited[b]) {
				visited[b] = true;
				count++;
			}
		}writer.write(String.valueOf(count));
		writer.flush();
	}
	

}
