package fourth;

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
		
		int n  = Integer.parseInt(bReader.readLine());
		String[] scoresStr = bReader.readLine().split(" ");
		int[] score = new int[n];
		int max = Integer.MIN_VALUE;
		double newscore = 0;
		
		for (int i = 0; i < n; i++) {
			score[i] =Integer.parseInt(scoresStr[i]);
			
			if (score[i] > max) {
				max = score[i];
			}
		}
		for (int i = 0; i < score.length; i++) {
			newscore += (score[i] / (double) max) * 100;
		}bWriter.write(String.valueOf(newscore / n));
		bWriter.flush();
		
		
	}

}
