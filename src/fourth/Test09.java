package fourth;

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
	
		String[] num = bReader.readLine().split(" ");
		int n = Integer.parseInt(num[0]);
		int m = Integer.parseInt(num[1]);
		
		int[] basket = new int[n];
		for (int i = 0; i < n; i++) {
			basket[i] = i +1;
		}
		
		for (int k = 0; k < m; k++) {
			String[] reverse = bReader.readLine().split(" ");
			int i = Integer.parseInt(reverse[0]) -1;
			int j = Integer.parseInt(reverse[1]) -1;
			while (i < j) {
				int temp = basket[i];
				basket[i] = basket[j];
				basket[j] = temp;
				i++;
				j--;
			}
		}
		for (int i = 0; i < basket.length; i++) {
			bWriter.write(basket[i] + " ");
		}
		bWriter.newLine();
		bWriter.flush();
		
	}
	

}
