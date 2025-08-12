package fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Test06 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] num = bReader.readLine().split(" ");
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);
		
		int[] basket = new int[n];
		
		for (int i = 0; i < n; i++) {
			basket[i] = i +1;
		}
		for (int i = 0; i < m; i++) {
			
			String[] input = bReader.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
		
			
			int temp = basket[a - 1];
			basket[a - 1] = basket[b -1];
			basket[b -1] = temp;
			
		
		}for (int i = 0; i < basket.length; i++) {
			bWriter.write(basket[i] + " ");
		}
		bWriter.flush();
	}

}





	
