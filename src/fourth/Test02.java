package fourth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bReader =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
//		int n = Integer.parseInt(bReader.readLine());
		int x = Integer.parseInt(bReader.readLine());
		String[] num =bReader.readLine().split(" ");
		List<Integer> list = new ArrayList<Integer>();

		
		for (String numString : num) {
			int num2 =Integer.parseInt(numString);
			list.add(num2);
			int num3 =Integer.parseInt(numString);
			list.add(num3);
			if (num3 < x) {
				bWriter.write(String.valueOf(num2+" "));
			}

		}bWriter.flush();
		
		
	}

}